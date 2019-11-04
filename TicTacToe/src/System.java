
public class System {
	public static final boolean XTURN = false;
	public static final boolean OTURN = true;
	public static final int BLANK = 0;
	public static final int XSYMBOL = 1;
	public static final int OSYMBOL = 2;
	private boolean turn;
	private int[][] grid;
	
	public System() {
		turn = XTURN;
		grid = new int[3][3];
	}
	
	public void switchTurn() {
		if (turn == XTURN)
			turn = OTURN;
		else
			turn = XTURN;
	}
	
	public boolean checkBoard() {
		
	}
}
