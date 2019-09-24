
public class Logo_game {
	//#define
	private static final int FLOOR_SIZE = 20;
	private static final int PEN_UP = 0;
	private static final int PEN_DOWN = 1;
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	private static final int RAW = 1;
	private static final int COLUMN = 1;
	private static final int START_POINT_X = 0;
	private static final int START_POINT_Y = 0;
	
	//local arguments
	private static int penStatus;
	private static int direction;
	private static int move;
	int[][] floor;
	private int[] setOfCommands;
	private int locationX;
	private int locationY;
	
	
	public Logo_game(int [] setOfCommands, int sizeOFSetOfCommands) {
		floor = new int[FLOOR_SIZE][FLOOR_SIZE];
		penStatus = PEN_UP;
		move = RIGHT;
		direction = RAW;
		this.setOfCommands = new int [sizeOFSetOfCommands];
		for(int i = 0; i < sizeOFSetOfCommands;i++) {
			this.setOfCommands[i] = setOfCommands[i];
		}
		locationX = START_POINT_X;
		locationY = START_POINT_Y;
		
	}
	
	
	private void penUP() {
		penStatus = PEN_UP;
	}
	
	private void penDown() {
		penStatus = PEN_DOWN;
	}
	
	private void left() {
		direction = LEFT;
	}
	
	private void right() {
		direction = RIGHT;
	}
	
	private void moveForward(int stepsNum) {
		try {
			for (int i = 0 ; i < stepsNum ; i++) {
				if ()
			}
			this.setOfCommands[locationX][locationY];
		}
			
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Error! out from floor.");
		}
	}
	
	private void printFloor() {
		
	}
	
}
