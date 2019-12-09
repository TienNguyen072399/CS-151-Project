
public class TicTacToeSystem {
	public static final int BLANK = 0;
	public static final int XSYMBOL = 1;
	public static final int OSYMBOL = 2;
	private int turn;
	private int[][] grid;
	private boolean gameOver;
	
	public TicTacToeSystem() {
		turn = XSYMBOL;
		gameOver = false;
		grid = new int[3][3];
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++) {
				grid[x][y] = 0;
			}
		}
	}
	public void setGrid(int row, int col, int symbol) {
		grid[row][col] = symbol;
		System.out.println("grid[" + row + "][" + col + "] = " + grid[row][col]);
	}
	
	
	public void switchTurn() {
		if (turn == XSYMBOL)
			turn = OSYMBOL;
		else
			turn = XSYMBOL;
	}
	
	public String getTurn() {
		if(turn == XSYMBOL) {
			return "X";
		}
		else {
			return "O";
		}
	}
	
	public String getLetterTurn() {
		if (turn == XSYMBOL)
		{
			return "X";
		}
		else
		{
			return "O";
		}
	}
	
	public boolean getGameOver() {
		return gameOver;
	}
	
	public void setGameOver(Boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	
	public int checkTie() {
		int checkAll = 0;
		for (int row = 0; row <3; row++)
		{
			for (int col = 0; col <3; col++)
			{
				if (grid[row][col] == 1 || grid[row][col] == 2)
				{
					checkAll++;
				}
			}
		}
		if (checkAll == 9)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int checkGrid() {
				
		int winner = 0;
		
		if ((grid[0][0] == 1 && grid[0][1] == 1 && grid[0][2] == 1) ||
			(grid[0][0] == 2 && grid[0][1] == 2 && grid[0][2] == 2)	) {
				winner = turn;
		}
		else if ((grid[0][0] == 1 && grid[1][0] == 1 && grid[2][0] == 1) ||
				(grid[0][0] == 2 && grid[1][0] == 2 && grid[2][0] == 2)	) {
			winner = turn;
		}
		else if ((grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1) ||
				(grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2)	) {
			winner = turn;
		}
		else if ((grid[2][0] == 1 && grid[1][1] == 1 && grid[0][2] == 1) ||
				(grid[2][0] == 2 && grid[1][1] == 2 && grid[0][2] == 2)	) {
			winner = turn;
		}
		else if ((grid[1][0] == 1 && grid[1][1] == 1 && grid[1][2] == 1) ||
				(grid[1][0] == 2 && grid[1][1] == 2 && grid[1][2] == 2)	) {
			winner = turn;
		}
		else if ((grid[0][0] == 1 && grid[1][0] == 1 && grid[2][0] == 1) ||
				(grid[0][0] == 2 && grid[1][0] == 2 && grid[2][0] == 2)	) {
			winner = turn;
		}
		else if ((grid[0][1] == 1 && grid[1][1] == 1 && grid[2][1] == 1) ||
				(grid[0][1] == 2 && grid[1][1] == 2 && grid[2][1] == 2)	) {
			winner = turn;
		}
		else if ((grid[0][2] == 1 && grid[1][2] == 1 && grid[2][2] == 1) ||
				(grid[0][2] == 2 && grid[1][2] == 2 && grid[2][2] == 2)	) {
			winner = turn;
		}
		
		
		if(winner != 0) {
			gameOver = true;
			return winner;
		}
		
		else {
			return winner;
		}
	}

}
