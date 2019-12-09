import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class TicTacToe {
	
	public static void main(String[] args) {
		
		Board b = new Board();
		
		//Introduction
		JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe, first player to get 3 in a row wins!");
		
		//Set Player Names
		b.setPlayerOne(JOptionPane.showInputDialog("What is Player's 1 name?"));
		b.setPlayerTwo(JOptionPane.showInputDialog("What is Player's 2 name?"));
		
		
		//Creates the tic tac toe board
		b.createBoard();
		
		
	}
}
