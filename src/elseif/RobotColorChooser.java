//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob= new Robot();
		
		//3. Ask the user what color they would like the robot to draw

		
		while (true) {
			String y=	JOptionPane.showInputDialog("What color do you want to draw?");
			//5. Use an if/else statement to set the pen color that the user requested
        if(y.equalsIgnoreCase("Red")) {
        	   bob.setPenColor(255,0,0);
        }
        else if(y.equalsIgnoreCase("Blue")) {
        	bob.setPenColor(0,0,255);
        }
        else if(y.equalsIgnoreCase("Green")) {
        	bob.setPenColor(0,255,0);
        }
        else {
        	bob.setRandomPenColor();
        }
        bob.setPenWidth(10);
        bob.setSpeed(70);
        bob.penDown();
        bob.move(100);
        bob.turn(90);
		}
	
	
	
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
