package elseif;
import javax.swing.JOptionPane;
public class AreYouHappy {

	public static void main(String[] args) {
	   String y= JOptionPane.showInputDialog("Are you Happy?");
	   if(y.equalsIgnoreCase("Yes")) {
		   JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
	   }
	   else if(y.equalsIgnoreCase("No")) {
		   String answer= JOptionPane.showInputDialog("Do you want to be Happy?");
		   if(answer.equalsIgnoreCase("Yes")){
		   		JOptionPane.showMessageDialog(null, "Change something");
	   }
		   else if(answer.equalsIgnoreCase("no")) {
			   JOptionPane.showMessageDialog(null,"Keep doing what ever you are doing!");
		   }
	}

}
}
