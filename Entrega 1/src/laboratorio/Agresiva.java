package laboratorio;

public final class Agresiva implements EstrategiaRobot {

    /*
        Gira el cañon 10° a propósito: para escanear y detectar enemigos más rápidamente
     */
    @Override
    public void run(LaboRobot robot) {
        robot.setColors(0x5B4839, 0x222328, 0x485C41);
        robot.turnGunRight(10);
    }

    /*
        Cuando detecta un enemigo, se gira en dirección a donde lo detectó
        Dispara con toda la potencia y se acerca
     */
    @Override
    public void onScannedRobot(LaboRobot robot) {
        robot.turnTo(robot.scannedAngle);
        this.fireAllPower(robot);
        robot.ahead(50);
    }

    /*
        Cuando le pegan un balazo, se gira en dirección a donde lo detectó y dispara con toda la potencia
     */
    @Override
    public void onHitByBullet(LaboRobot robot) {
        robot.turnGunTo(robot.hitByBulletAngle);
        this.fireAllPower(robot);
    }

    /*
        Retrocede y gira para no chocarse nuevamente
        Gira el cañón y dispara con toda la potencia
     */

    @Override
    public void onHitWall(LaboRobot robot) {
        robot.back(50);
        robot.turnRight(90);
        robot.turnGunRight(180);
        this.fireAllPower(robot);
    }

    /*
        Dispara con toda la potencia (3)
     */
    private void fireAllPower(LaboRobot robot) {
        robot.fire(3);
    }
}
