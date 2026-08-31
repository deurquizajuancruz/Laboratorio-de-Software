package laboratorio;

public final class Agresiva implements EstrategiaRobot {

    @Override
    public void run(LaboRobot robot) {
        robot.setColors(0x5B4839, 0x222328, 0x485C41);
        while (true) {
            robot.turnGunRight(360);
            robot.ahead(100);
            robot.turnGunRight(360);
            robot.ahead(100);
            robot.turnRight(45);
        }
    }

    @Override
    public void onScannedRobot(LaboRobot robot) {
        this.fireAllPower(robot);
    }

    @Override
    public void onHitByBullet(LaboRobot robot) {
        robot.turnGunTo(robot.hitByBulletAngle);
        this.fireAllPower(robot);
    }

    @Override
    public void onHitWall(LaboRobot robot) {
        robot.back(50);
        robot.turnRight(90);
        robot.turnGunRight(180);
        this.fireAllPower(robot);
    }

    private void fireAllPower(LaboRobot robot) {
        robot.fire(3);
    }
}
