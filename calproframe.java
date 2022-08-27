package calproclassed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class calproframe extends JFrame{

	protected  JFrame frame;

	calproframe(){
	
		ImageIcon image=new ImageIcon("nikdhairya.jpg");
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.setBounds(150, 150, 415, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setIconImage(image.getImage());
		frame.getContentPane().setLayout(null);
		
		new definebuttons();
		frame.add(calproclassed.displays);
		frame.add(calproclassed.numbers);
		
		
		frame.setVisible(true);
		
		
		
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1643011092305629040L;


		
	}

