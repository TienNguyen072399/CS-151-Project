import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class TicTacToe {
	private static TicTacToeSystem t = new TicTacToeSystem();
	private static final XSymbol X = new XSymbol(160,160);
	private static final OSymbol O = new OSymbol(140,140);
	
	
	//When the button gets pressed, it puts in the appropriate symbol and disables the button
	//and switches the turn
	public static ActionListener createTicTacButtonListener(int row, int col) {
		return event -> {
			JButton source = (JButton) event.getSource();
			if(t.getTurn() == 1) {
				source.setIcon(X);
				t.setGrid(row, col, 1);
			}
			else {
				source.setIcon(O);
				t.setGrid(row, col, 2);
			}
			source.setEnabled(false);
			int winner = t.checkGrid();
			
			if(!t.getGameOver()) {
				t.switchTurn();
			}
			else {
				System.out.println("Winner is " + winner);
			}
			
		};
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		
		
		//JButton 2D Array
		JButton[][] buttons = new JButton[3][3];
			
		//Initializes the buttons in the array and adds their actionlisteners
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				buttons[i][j] = new JButton("" + i + j);
				
			
				
				buttons[i][j].addActionListener(createTicTacButtonListener(i, j));
				
			}
		}

	
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(3,3));
		
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				gamePanel.add(buttons[i][j]);
			}
		}
		
		
		JPanel information = new JPanel();
		JLabel turn = new JLabel("It is x turn");
		
		information.add(turn);
				
				
		frame.setLayout(new BorderLayout());
		frame.add(information, BorderLayout.NORTH);
		frame.add(gamePanel, BorderLayout.CENTER);
		
		
		//Adds Buttons to the Frame
		
		
		
		
		frame.setPreferredSize(new Dimension(500, 500));



		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
