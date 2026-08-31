package laboratorio;

public sealed interface EstrategiaRobot permits Agresiva, Defensiva, Pacifista {

    void run(LaboRobot robot);

    void onScannedRobot(LaboRobot robot);

    void onHitByBullet(LaboRobot robot);

    void onHitWall(LaboRobot robot);
}
