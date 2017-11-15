import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String age = JOptionPane.showInputDialog("What is your age?");
		String hobby = JOptionPane.showInputDialog("What is your hobby?");
		JOptionPane.showMessageDialog(null, "Hello! "+ name +" you are "+ age+" years old, and you like " + hobby + ".");
		
	}
}
