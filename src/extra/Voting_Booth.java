package extra;

import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String JV = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(JV);
	if(age>18) {
	String JV3 = JOptionPane.showInputDialog("Who should be the next president?");
	if(JV3.equals("Jake Paul")) {
		JOptionPane.showMessageDialog(null, "Good choice");
		}
	else {JOptionPane.showMessageDialog(null, "you need to become a jake pauler");
		
	}
}
	else {
		JOptionPane.showMessageDialog(null, "u have no say boi xd");
	}
}
}
