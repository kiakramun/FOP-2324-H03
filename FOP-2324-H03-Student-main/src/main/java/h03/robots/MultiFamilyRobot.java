package h03.robots;

import fopbot.Robot;
import fopbot.RobotFamily;

public class MultiFamilyRobot extends Robot {

    /**
     * The sequence of robot families to change between.
     */
    public final RobotFamily[] families;

    /**
     * The index of the current robot family in the sequence.
     */
    public int current = 0;

    /**
     * Construct a {@link MultiFamilyRobot} on the given position with the given families
     * @param x the position on the x-axis
     * @param y the position on the y-axis
     * @param families the sequence of families to change between
     */
    public MultiFamilyRobot(final int x,final int y,final RobotFamily[] families) {
        super(x,y,families[0]);
        this.families = families;
    }

    /**
     * Exchanges the current robot with the next one in the sequence. If the current robot is the
     * last robot in the sequence, the first robot will be used again.
     */
    public void exchange() {
        current = (current+1) % families.length;
        setRobotFamily(families[current]);
    }

    public void move(){
        super.move();
        exchange();
    }

    /**
     * Moves the robot and exchanges the robot, if <code>exchange</code> is <code>true</code>
     * @param exchange whenever to exchange the robot
     */
    public void move(final boolean exchange){
        super.move();
        if (exchange) {
            exchange();
        }
    }

}
