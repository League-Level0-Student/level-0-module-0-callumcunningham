import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is your Name?");
		System.out.println(name);
		JOptionPane.showMessageDialog(null, "Greetings! "+ name);
	}
		
	
}
