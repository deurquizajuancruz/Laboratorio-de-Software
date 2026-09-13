package deUrquiza;

public record Pacifista() implements EstrategiaRobot {
    private static final int DISTANCIA = 250;
    private static final int ANGULO_DIAGONAL = 135;

    /*
        Da una vuelta con el cañón para detectar enemigos y se empieza a mover
     */
    @Override
    public void run(RobotGuerra robot) {
        robot.setColors(0xffffff, 0xffffff, 0xffffff);
        robot.turnGunRight(360);
        robot.ahead(DISTANCIA);
    }

    /*
        Cuando detecta un enemigo, se mueve en diagonal
     */
    @Override
    public void onScannedRobot(RobotGuerra robot) {
        this.huirDiagonal(robot, robot.scannedAngle);
    }

    /*
        Si le pegan, se mueve en diagonal desde donde vino la bala
     */
    @Override
    public void onHitByBullet(RobotGuerra robot) {
        this.huirDiagonal(robot, robot.hitByBulletAngle);
    }

    /*
        Se despega de la pared en diagonal y sigue huyendo
     */
    @Override
    public void onHitWall(RobotGuerra robot) {
        this.huirDiagonal(robot, robot.hitWallAngle);
    }

    private void huirDiagonal(RobotGuerra robot, int angulo) {
        robot.turnTo(angulo + ANGULO_DIAGONAL);
        robot.ahead(DISTANCIA);
    }
}
