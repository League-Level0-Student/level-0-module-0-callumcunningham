import javax.swing.JOptionPane;

public class AnnoyingMessage {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello!");
			
		String password = JOptionPane.showInputDialog("What is your Password?");
		
		System.out.println(password);
	}
	
}
