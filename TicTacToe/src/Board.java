import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Board {
	private TicTacToeSystem ticTacSys;
	private final XSymbol X = new XSymbol(140,140);
	private final OSymbol O = new OSymbol(140,140);
	private String playerOne = null;
	private String playerTwo = null;
	private Boolean gameOver = false;

	JButton[][] buttons = new JButton[3][3];
	
	
	public Board() {
		ticTacSys = new TicTacToeSystem();
	}
	
	public ActionListener createTicTacButtonListener(int row, int col) {
		return event -> {
			JButton source = (JButton) event.getSource();
			if(ticTacSys.getTurn() == "X") {
				source.setIcon(X);
//				source.setBackground(Color.black);
				ticTacSys.setGrid(row, col, 1);
				if(ticTacSys.checkTie() == 1)
				{
					ticTacSys.setGameOver(true);
				}
			}
			else {
				source.setIcon(O);
//				source.setBackground(Color.red);
				ticTacSys.setGrid(row, col, 2);
				if(ticTacSys.checkTie() == 1)
				{
					ticTacSys.setGameOver(true);
				}
			}
			source.setEnabled(false);
			int winner = ticTacSys.checkGrid();
			
			if(!ticTacSys.getGameOver()) {
				ticTacSys.switchTurn();
			}
			else {
				if(winner == 1) {
					//System.out.println("Winner is X");
					JOptionPane.showMessageDialog(null, playerOne + " wins!");
					restartBoard();
				}
				else if(winner == 2) {
					//System.out.println("Winner is O");
					JOptionPane.showMessageDialog(null, playerTwo + " wins!");
					restartBoard();
				}
				else {
					//System.out.println("Winner is O");
					JOptionPane.showMessageDialog(null, "It was a tie!");
					restartBoard();
				}
			}
			
		};
	}
	
	public void restartBoard() {
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				buttons[i][j].setIcon(null);
				buttons[i][j].setEnabled(true);
				ticTacSys.setGrid(i, j, 0);
			}
		}
		ticTacSys.setGameOver(false);
	}
	
	public void setPlayerOne(String name) {
		playerOne = name;
	}
	
	public void setPlayerTwo(String name) {
		playerTwo = name;
	}
	public void createBoard() {
		JFrame frame = new JFrame();
		
		
			
		//Initializes the buttons in the array and adds their actionlisteners
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].addActionListener(createTicTacButtonListener(i, j));
			}
		}
		
		//3x3 Grid
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(3,3));
		
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				gamePanel.add(buttons[i][j]);
			}
		}
		
		
		frame.setLayout(new BorderLayout());
		frame.add(gamePanel, BorderLayout.CENTER);
		
		
		
		//Adds Buttons to the Frame
		
		
		
		
		frame.setPreferredSize(new Dimension(500, 500));


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
