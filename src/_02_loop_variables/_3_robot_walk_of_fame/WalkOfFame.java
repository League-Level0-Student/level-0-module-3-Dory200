
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot r = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		r.setX(100);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		r.setSpeed(200);
		r.hide();
		r.penDown();
		r.move(30);
		r.turn(160);
		r.move(30);
		r.turn(-70);
		r.move(30);
		r.turn(150);
		r.move(30);
		r.turn(-50);
		r.move(30);
		r.turn(150);
		r.move(30);
		r.turn(-70);
		r.move(30);
		r.turn(150);
		r.move(30);
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
