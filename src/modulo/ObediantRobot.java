package modulo;
import org.jointheleague.graphical.robot.Robot;
public class ObediantRobot {

	public static void main(String[] args) {
	    Robot rob= new Robot();
	    rob.penDown();
	    rob.setSpeed(50);
	    //ObediantRobot ryan= new ObediantRobot();
	    //ryan.DrawSquare(rob);
	   // ObediantRobot ray= new ObediantRobot();
	    //ray.drawTriangle(rob);
	    
	    ObediantRobot oh= new ObediantRobot();
	    oh.drawCircle(rob);

	}
	public void DrawSquare(Robot rob) {
		for(int i=0; i<4; i++) {
	    	rob.turn(90);
	    	rob.move(100);
	    }
	}
	public void drawTriangle(Robot rob) {
		for(int i=0; i<3; i++) {
			rob.turn(120);
			rob.move(100);
		}
	}
	public void drawCircle(Robot rob) {
		//I am stuck on this part. I do not know how to draw a circle. 
		for(int i=0; i<3; i--) {
			rob.turn
		}
	}

}
