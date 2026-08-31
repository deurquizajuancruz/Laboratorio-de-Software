package laboratorio;

import robocode.*;


public class LaboRobot extends JuniorRobot {
	private EstrategiaRobot estrategia = new Agresiva();

    @Override
    public void run() {
        this.estrategia.run(this);
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    @Override
    public void onScannedRobot() {
        this.estrategia.onScannedRobot(this);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    @Override
    public void onHitByBullet() {
        this.estrategia.onHitByBullet(this);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    @Override
    public void onHitWall() {
        this.estrategia.onHitWall(this);
    }
}