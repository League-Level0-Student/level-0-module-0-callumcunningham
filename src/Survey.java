import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Survey {
	public static void main(String[] args) {
		
		int a = JOptionPane.showConfirmDialog(null, "Do you like pie?"," Think",
				JOptionPane.YES_NO_OPTION);
				
		if (a == JOptionPane.YES_OPTION)   {
					JOptionPane.showMessageDialog(null, "Awsome!");
					TimeUnit.SECONDS.toMillis(5);
					String flavor = JOptionPane.showInputDialog(null, "What is your favorite flavor?");
					JOptionPane.showMessageDialog(null, "Wow! , "+ flavor + " is my favorite flavor too! What a Coincidence!");
			}
				else {
					JOptionPane.showMessageDialog(null, "Fine");
			}
			}
			}

