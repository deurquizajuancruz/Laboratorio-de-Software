package deUrquiza;

public sealed interface EstrategiaRobot permits Agresiva, Defensiva, Pacifista {

    void run(RobotGuerra robot);

    void onScannedRobot(RobotGuerra robot);

    void onHitByBullet(RobotGuerra robot);

    void onHitWall(RobotGuerra robot);
}
