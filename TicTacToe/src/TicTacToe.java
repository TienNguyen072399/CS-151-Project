import java.awt.*;

import javax.swing.*;

public class TicTacToe {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	
		
		
		frame.setLayout(new GridLayout(3,3));
		
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		frame.add(new JButton(""));
		
		
		frame.setPreferredSize(new Dimension(500, 500));



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
