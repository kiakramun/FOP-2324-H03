package h03.robots;

import fopbot.RobotFamily;
import static fopbot.RobotFamily.SQUARE_RED;
import static fopbot.RobotFamily.SQUARE_GREEN;
import static fopbot.RobotFamily.SQUARE_BLUE;

public class RGBRobot extends MultiFamilyRobot {

    /**
     * A sequence of a red, green and blue square robot.
     */
    private static final RobotFamily[] RGB = new RobotFamily[]{SQUARE_RED,SQUARE_GREEN,SQUARE_BLUE};

    /**
     * A sequence of a blue, red and green square robot.
     */
    private static final RobotFamily[] BRG = new RobotFamily[]{SQUARE_BLUE,SQUARE_RED,SQUARE_GREEN};

    /**
     * Constructs a {@link RGBRobot} on the given position with a sequence of the robot families
     * {@link RobotFamily#SQUARE_RED}, {@link RobotFamily#SQUARE_BLUE}, {@link RobotFamily#SQUARE_GREEN}
     * @param x the position on the x-axis
     * @param y the posotion on the y-axis
     * @param inverted whether the sequence of predefined robot families should be inverted
     */
    public RGBRobot(final int x,final int y,final boolean inverted){
        super(x,y, !inverted? RGB : BRG);
    }

    /**
     *  Exchanges the current robot 3 times to cycle through all robots
     */
    public void testRGB(){
        for (int i = 0; i < 3; i++) {
            exchange();
        }
    }
}
