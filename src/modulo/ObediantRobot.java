package modulo;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
public class ObediantRobot {

	public static void main(String[] args) {
		 Robot rob= new Robot();
         rob.penDown();
		 rob.setSpeed(50);
		String y=JOptionPane.showInputDialog("Which shape do you want?");
		if(y.equalsIgnoreCase("Triangle")) {
			ObediantRobot main= new ObediantRobot();
			main.drawTriangle(rob);
		}
		else if(y.equalsIgnoreCase("Square")) {
			ObediantRobot main= new ObediantRobot();
			main.DrawSquare(rob);
		}
		else if(y.equalsIgnoreCase("Circle")) {
			 ObediantRobot oh= new ObediantRobot();
			    oh.drawCircle(rob);
		}
	   
	    //ObediantRobot ryan= new ObediantRobot();
	    //ryan.DrawSquare(rob);
	   // ObediantRobot ray= new ObediantRobot();
	    //ray.drawTriangle(rob);
	    
	   

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
		for(int i=0; i<36; i++) {
			rob.turn(10);
			rob.move(1);
		}
	}

}
