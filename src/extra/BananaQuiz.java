//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer= JOptionPane.showInputDialog("Do you like bananas?");
		if(answer.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null,"You are crazy");
			return;
		}
		else if(answer.equalsIgnoreCase("Yes")) {
			String hobby= JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby+" is much better with bananas!");
		}
		else {
			JOptionPane.showMessageDialog(null,"You are bananas!?");
		}
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than �쐙es�? or �쐍o�?
		//	show a pop up that says �쏽ou are bananas!�?
	
	}

}
