/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	Robot bb8 = new Robot();


        bb8.penDown();


        bb8.setSpeed(100);
        
        	for (int i = 0; i < 4; i++) {
				
			
       
        	bb8.move(200);
        	bb8.turn(90);



        	}
    }
}
