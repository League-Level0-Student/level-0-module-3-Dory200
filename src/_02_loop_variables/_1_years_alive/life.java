package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;

public class life {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you");
	int life = Integer.parseInt(age);
	for(int i = 0; i <= life; i++) {
		System.out.println(i);
		
	}
}
}
