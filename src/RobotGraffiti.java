import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot R2D2 = new Robot();
		R2D2.setAngle(-90);	
		R2D2.penDown();
			for (int i = 0; i < 200; i++) {
				
				R2D2.turn(-1);
				R2D2.move(1);
			}
			
	}
}
