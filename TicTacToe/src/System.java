
public class System {
	public static final int BLANK = 0;
	public static final int XSYMBOL = 1;
	public static final int OSYMBOL = 2;
	private int turn;
	private int[][] grid;
	
	public System() {
		turn = XSYMBOL;
		grid = new int[3][3];
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++) {
				grid[x][y] = 0;
			}
		}
	}
	
	public void switchTurn() {
		if (turn == XTURN)
			turn = OTURN;
		else
			turn = XTURN;
	}
	
	public int checkBoard() {
		if ((grid[0][0] == 1 && grid[0][1] == 1 && grid[0][2] == 1) ||
			(grid[0][0] == 2 && grid[0][1] == 2 && grid[0][2] == 2)	) {
				return turn;
		}
		else if ((grid[0][0] == 1 && grid[1][0] == 1 && grid[2][0] == 1) ||
				(grid[0][0] == 2 && grid[1][0] == 2 && grid[2][0] == 2)	) {
					return turn;
		}
		else if ((grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1) ||
				(grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2)	) {
					return turn;
		}
		else if ((grid[2][0] == 1 && grid[1][1] == 1 && grid[0][2] == 1) ||
				(grid[2][0] == 2 && grid[1][1] == 2 && grid[0][2] == 2)	) {
					return turn;
		}
	}
}
