


package calproclassed;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class calproclassed {

	public static JFrame frame;
	public static JPanel numbers, operators, displays;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				try {
					
					new calproframe(); // this will call the frame class
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	//}

	//}

