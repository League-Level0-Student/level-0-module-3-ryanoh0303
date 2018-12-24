
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 24th";
		String dadsBirthday = "August 17th";
		String myBirthday = "March 3rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String answer= JOptionPane.showInputDialog("Who's birthday do you want?");
	
		if(answer.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null,momsBirthday );
		}
		else if(answer.equalsIgnoreCase("Dad")) {
			JOptionPane.showMessageDialog(null,dadsBirthday);
		}
		else if(answer.equalsIgnoreCase("me")) {
			JOptionPane.showMessageDialog(null,myBirthday);
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Sorry, I don't remember that person's birthday!");
		}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
