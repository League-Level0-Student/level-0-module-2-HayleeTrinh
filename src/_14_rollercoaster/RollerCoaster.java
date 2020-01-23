package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String tall = JOptionPane.showInputDialog("If you wanna ride the rollercoaster, you're gonna have to be tall enough. How tall are you in inches?");
		int toll = Integer.parseInt(tall);
		if (toll>47) {
			JOptionPane.showMessageDialog(null, "Your free to go. Have a fun trip!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You can't ride the rollercoaster.");
		}
	}
}
