package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			boolean Break = false;
			int Winner = 0;
			Robot[] Robots = {new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini")};
			for (int RobotLooper = 0; RobotLooper < Robots.length; RobotLooper++) {
				Robots[RobotLooper].show();
				Robots[RobotLooper].setX(25 * RobotLooper + 25);
				Robots[RobotLooper].setY(500);
			}
			Random RNG = new Random();
			while (true) {
				for (int RobotLooper = 0; RobotLooper < Robots.length; RobotLooper++) {
					Robots[RobotLooper].setSpeed(RNG.nextInt(100));
					Robots[RobotLooper].move(RNG.nextInt(50));
					Robots[RobotLooper].turn(10);
				}
				for (int RobotLooper = 0; RobotLooper < Robots.length; RobotLooper++) {
					if (Robots[RobotLooper].getY() > 525) {
						Break = true;
					}
				}
				if (Break) {
					break;
				}
			}
			for (int RobotLooper = 0; RobotLooper < Robots.length; RobotLooper++) {
				if (Robots[RobotLooper].getY() > 525) {
					Winner = RobotLooper + 1;
					JOptionPane.showMessageDialog(null, "ROBOT " + (RobotLooper + 1) + " WON!!!!!!!");
					break;
				}
			}
			while (true) {
				Robots[Winner].turn(5);
			}
		}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
