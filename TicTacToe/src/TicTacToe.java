import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class TicTacToe {
	private static TicTacToeSystem t = new TicTacToeSystem();
	private static final XSymbol X = new XSymbol(160,160);
	private static final OSymbol O = new OSymbol(140,140);
	private static String player1 = null;
	private static String player2 = null;
	
	
	//When the button gets pressed, it puts in the appropriate symbol and disables the button
	//and switches the turn
	public static ActionListener createTicTacButtonListener(int row, int col) {
		return event -> {
			JButton source = (JButton) event.getSource();
			if(t.getTurn() == 1) {
				source.setIcon(X);
				source.setBackground(Color.black);
				t.setGrid(row, col, 1);
			}
			else {
				source.setIcon(O);
				source.setBackground(Color.red);
				t.setGrid(row, col, 2);
			}
			source.setEnabled(false);
			int winner = t.checkGrid();
			
			if(!t.getGameOver()) {
				t.switchTurn();
			}
			else {
				if(winner == 1) {
					//System.out.println("Winner is X");
					JOptionPane.showMessageDialog(null, player1 + " wins!");
				}
				else {
					//System.out.println("Winner is O");
					JOptionPane.showMessageDialog(null, player2 + " wins!");
				}
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
		
		JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe, first player to get 3 in a row wins!");
		player1 = JOptionPane.showInputDialog("What is Player's 1 name?");
		player2 = JOptionPane.showInputDialog("What is Player's 2 name?");
	
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
