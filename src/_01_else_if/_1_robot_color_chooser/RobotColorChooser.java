
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot r = new Robot();
		r.setSpeed(100);
		r.setPenWidth(10);
		
		r.penDown();
		r.move(90);
		r.turn(90);
		r.move(90);
		r.turn(90);
		r.move(90);
		r.turn(90);
		r.move(90);
		String color = JOptionPane.showInputDialog("do you want your pen to be red or blue");
		if(color.equals("red")) {
			r.setPenColor(Color.red);
		}
		if(color.equals("blue")) {
			r.setPenColor(Color.BLUE);
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
