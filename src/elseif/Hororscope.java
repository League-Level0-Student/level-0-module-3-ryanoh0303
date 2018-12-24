package elseif;
import javax.swing.JOptionPane;

public class Hororscope {

	public static void main(String[] args) {
		String answer= JOptionPane.showInputDialog("What is your star sign?");
		if(answer.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null,"Think carefully before you pursue a new biginning day.");
		}
		else if(answer.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null,"Share what's in your heart with someone who is drifiting away from you today, and they will come back");
			}
		else if(answer.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Don't  let bumps in your road slow you down today, keep working hard and moving forward.");
			
		}
		else  if(answer.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null,"As The Moon enters your house today your head and your heart dont agree and you need a compromise.");
			
		}
		else if(answer.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Not everyone will understand your enthusiastic ideas today, but thats ok, youre ahead of the times.");
		}
		else if(answer.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Allow your needs to be strength not weakness, be positive about them and dont obsess over them.");
		}
		else if(answer.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null,"Resist the urge to tell others what you think of their situation today, they wont want to hear it.");
		}
		else if(answer.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null,"You might want some excitement today, but think it through before you leap into anything." );
		}
		else if(answer.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null,"Use your high social energy today for networking and take advantage of new opportunities to connect.");
		}
		else if(answer.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Consider your overall health today and especially your emotional health, look for lasting solutions to issues.");
			
		}
		else if(answer.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null,"When old family issues rear up today and challenge you, be sure of your position before you react");
		}
		else if(answer.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Commit to your journey today, whether you are a leader or a follower and be emotionally prepared.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter a valid answer");
		}

	}

}
