import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class TicTacToe {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		
		
		frame.setLayout(new GridLayout(3,3));
		

		XSymbol X = new XSymbol(160,160);
		OSymbol O = new OSymbol(140,140);
				
		JButton button1 = new JButton ();
		JButton button2 = new JButton (X);
		JButton button3 = new JButton (O);
		JButton button4 = new JButton ();
		JButton button5 = new JButton ();
		JButton button6 = new JButton (X);
		JButton button7 = new JButton ();
		JButton button8 = new JButton ();
		JButton button9 = new JButton ();


		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		

		
		
		frame.setPreferredSize(new Dimension(500, 500));



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
