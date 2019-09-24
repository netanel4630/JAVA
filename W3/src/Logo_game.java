
public class Logo_game {
	//#define
	private static final int FLOOR_SIZE = 20;
	private static final int PEN_UP = 0;
	private static final int PEN_DOWN = 1;
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	private static final int RAW = 1;
	private static final int COLUMN = 0;
	private static final int START_POINT_X = 0;
	private static final int START_POINT_Y = 0;
	private static final int MARK = 1;
	
	//local arguments
	private static int penStatus;
	private static int direction;
	private static int move;
	int[][] floor;
	private int[] setOfCommands;
	private int locationX;
	private int locationY;
	private int stepsNum = 0;
	
	
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
	
	private void printFloor() {
		for (int i = 0 ; i < FLOOR_SIZE ; i++) {
			for (int j = 0 ; j < FLOOR_SIZE ; j++) {
				if (floor[i][j] == MARK) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.print("\n");
		}
	}
	
	private void penUP() {
		penStatus = PEN_UP;
	}
	
	private void penDown() {
		penStatus = PEN_DOWN;
	}
	
	private void left() {
		move = LEFT;
		setDirection();	
	}
	
	private void right() {
		move = RIGHT;
		setDirection() ;
	}
	
	private void setDirection() {
		if (direction == RAW) {
			direction = COLUMN;
		}
		else {
			direction = RAW;
		}
	}
	
	
	private void moveForward() {
		if (PEN_DOWN == penStatus) {
			for (int i = 0 ; i < stepsNum ; i++) {
				paintStars();
			}	
		}
		else {
			System.out.println("Cant paint "+stepsNum+" step.\nPen is up.");
		}

	}
	
	private void paintStars() {
		try {
			if (RIGHT == move && RAW == direction) {
				locationX++;
			}
			else if (RIGHT == move && COLUMN == direction) {
				locationY++;
			}
			else if (LEFT == move && RAW == direction) {
				locationX--;
			}
			else if (LEFT == move && COLUMN == direction) {
				locationY--;
			}					
			
			this.floor[locationX][locationY] = MARK;			
		}
		
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Error! out from floor.");
		}
	
	}
	
	
    interface MoveAction {
        void move();
    }

    private MoveAction[] moveActions = new MoveAction[] {
        new MoveAction() { public void move() { penUP(); } },
        new MoveAction() { public void move() { penDown(); } },
        new MoveAction() { public void move() { right(); } },
        new MoveAction() { public void move() { left(); } },
        new MoveAction() { public void move() { moveForward(); } },
        new MoveAction() { public void move() { printFloor(); } },
    };

    public void move(int index) {
        moveActions[index].move();
    }
    
    
    
	
	public void doCommands() {
		
		
	}
	
	

	
}
