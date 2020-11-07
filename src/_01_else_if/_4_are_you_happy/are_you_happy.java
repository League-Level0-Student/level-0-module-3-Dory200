package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	String mood = JOptionPane.showInputDialog("are you happy?");
	if(mood.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing");
	}
	if(mood.equals("no")) {
		String maybe = JOptionPane.showInputDialog("do you want to be happy?");
		if(maybe.equals("no")) {
			JOptionPane.showMessageDialog(null, "keep doing what you are doing");
		}
		if(maybe.equals("yes")) {
			JOptionPane.showMessageDialog(null, "change something");
		}
	}
}
}
