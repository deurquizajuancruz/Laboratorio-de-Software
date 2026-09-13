package deUrquiza;

public interface Estratega {

    EstrategiaRobot AGRESIVA = new Agresiva();
    EstrategiaRobot DEFENSIVA = new Defensiva();
    EstrategiaRobot PACIFISTA = new Pacifista();

    EstrategiaRobot decidirEstrategia(RobotGuerra robot);

    static Estratega porEnergia() {
        return EstrategaEnergia.INSTANCIA;
    }

    static Estratega porEnemigos() {
        return EstrategaEnemigos.INSTANCIA;
    }

    /*
        La EstrategaEnergia decide una estrategia en base a su energía.
        Si tiene > 75 de energía, decide ser agresivo
        Si tiene < 75 pero > 25, decide ser defensivo
        Si tiene poca energía, decide ser pacifista y usar su energía para escapar
     */

    final class EstrategaEnergia implements Estratega {
        private static final EstrategaEnergia INSTANCIA = new EstrategaEnergia();

        private EstrategaEnergia() {
        }

        @Override
        public EstrategiaRobot decidirEstrategia(RobotGuerra robot) {
            if (robot.energy > 75) {
                return AGRESIVA;
            }
            if (robot.energy > 25) {
                return DEFENSIVA;
            }
            return PACIFISTA;
        }

    }

    /*
        La EstrategaEnemigos decide una estrategia en base a la cantidad de enemigos.
        Si > 4, decide ser pacifista
        Si < 4 pero > 1, decide ser defensivo
        Si hay solo 1 (o 0), decide ser agresivo y lo ataca
     */

    final class EstrategaEnemigos implements Estratega {
        private static final EstrategaEnemigos INSTANCIA = new EstrategaEnemigos();

        private EstrategaEnemigos() {
        }

        @Override
        public EstrategiaRobot decidirEstrategia(RobotGuerra robot) {
            if (robot.others > 4) {
                return PACIFISTA;
            }
            if (robot.others > 1) {
                return DEFENSIVA;
            }
            return AGRESIVA;
        }

    }

}
