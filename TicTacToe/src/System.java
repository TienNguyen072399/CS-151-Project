
public class System {
	public static final boolean XTURN = false;
	public static final boolean OTURN = true;
	private boolean turn;
	
	public System() {
		turn = XTURN;
	}
	
	public void switchTurn() {
		if (turn == XTURN)
			turn = OTURN;
		else
			turn = XTURN;
	}
	
	
}
