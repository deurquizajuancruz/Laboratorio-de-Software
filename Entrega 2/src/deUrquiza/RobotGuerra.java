package deUrquiza;

import robocode.*;


public class RobotGuerra extends JuniorRobot {
    private final Estratega estratega = Estratega.porEnemigos();

    @Override
    public void run() {
        while (true) {
            this.estratega.decidirEstrategia(this).run(this);
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    @Override
    public void onScannedRobot() {
        this.estratega.decidirEstrategia(this).onScannedRobot(this);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    @Override
    public void onHitByBullet() {
        this.estratega.decidirEstrategia(this).onHitByBullet(this);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    @Override
    public void onHitWall() {
        this.estratega.decidirEstrategia(this).onHitWall(this);
    }
}