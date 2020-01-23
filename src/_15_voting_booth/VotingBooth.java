package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int hn = Integer.parseInt(age);
		if(hn>17) {
			JOptionPane.showInputDialog("Who do think the next president should be?");
			JOptionPane.showMessageDialog(null, "Oh! Interesting.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Oh... No one care about what you think.");
		}
	}
}
