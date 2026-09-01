package laboratorio;

public final class Pacifista implements EstrategiaRobot {
    private final int distancia = 250;

    /*
        Da una vuelta con el cañón para detectar enemigos y se empieza a mover
     */
    @Override
    public void run(LaboRobot robot) {
        robot.setColors(0xffffff, 0xffffff, 0xffffff);
        robot.turnGunRight(360);
        robot.ahead(distancia);
    }

    /*
        Cuando detecta un enemigo, se mueve en diagonal
     */
    @Override
    public void onScannedRobot(LaboRobot robot) {
        robot.turnTo(robot.scannedAngle + 135);
        robot.ahead(distancia);
    }

    /*
        Si le pegan, se mueve en diagonal desde donde vino la bala
     */
    @Override
    public void onHitByBullet(LaboRobot robot) {
        robot.turnTo(robot.hitByBulletAngle + 135);
        robot.ahead(distancia);
    }

    /*
        Se despega de la pared en diagonal y sigue huyendo
     */
    @Override
    public void onHitWall(LaboRobot robot) {
        robot.turnTo(robot.hitWallAngle + 135);
        robot.ahead(distancia);
    }
}
