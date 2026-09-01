package laboratorio;

public final class Defensiva implements EstrategiaRobot {

    /*
        Gira el cañon 10° a propósito: para escanear y detectar enemigos más rápidamente
     */
    @Override
    public void run(LaboRobot robot) {
        robot.setColors(0x355e92, 0x15263a, 0x000000);
        robot.turnGunRight(10);
    }

    /*
        Cuando detecta un enemigo, se mueve perpendicular para evitar el disparo
        Si está muy cerca, se aleja más distanica, sino se aleja menos
     */
    @Override
    public void onScannedRobot(LaboRobot robot) {
        robot.turnTo(robot.scannedAngle + 90);
        robot.ahead(robot.scannedDistance < 200 ? 150 : 80);
    }

    /*
        Cuando le pegan un balazo, primero dispara con mediana potencia al lugar desde donde vino para defenderse
        Después se mueve de forma perpendicular
     */
    @Override
    public void onHitByBullet(LaboRobot robot) {
        robot.turnGunTo(robot.hitByBulletAngle);
        robot.fire(1.5);
        robot.turnTo(robot.hitByBulletAngle + 90);
        robot.ahead(100);
    }

    /*
        Se despega de la pared en diagonal
     */
    @Override
    public void onHitWall(LaboRobot robot) {
        robot.turnTo(robot.hitWallAngle + 135);
        robot.ahead(150);
    }
}
