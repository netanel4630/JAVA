
public class Logo_game {
	//#define
	private static final int FLOOR_SIZE = 20;
	private static final int PEN_UP = 0;
	private static final int PEN_DOWN = 1;
	private static final int RIGHT = 1;
	private static final int LEFT = 0;
	private static final int FACE_UP = 0;
	private static final int FACE_DOWN = 1;
	private static final int FACE_RIGHT= 2;
	private static final int FACE_LEFT= 3;
	private static final int START_POINT_X = 0;
	private static final int START_POINT_Y = 0;
	private static final int MARK = 1;
	private static final int MIN_COMMAND_NUM = 1;
	private static final int MAX_COMMAND_NUM = 6;
	private static final int FINNISH_COMMAND_NUM = 9;
	
	//local arguments
	private  int penStatus;
	private  int direction;
	private  int move;
	private  int[][] floor;
	private  int[] setOfCommands;
	private  int locationX;
	private  int locationY;
	private  int stepsNum = 0;
	
	
	public Logo_game(int [] setOfCommands) {
		floor = new int[FLOOR_SIZE][FLOOR_SIZE];
		penStatus = PEN_UP;
		move = RIGHT;
		direction = FACE_RIGHT;
		this.setOfCommands = new int [setOfCommands.length];
		for(int i = 0; i < setOfCommands.length;i++) {
			this.setOfCommands[i] = setOfCommands[i];
		}
		locationX = START_POINT_X;
		locationY = START_POINT_Y;
		
	}
	
	private void dummy() {
		System.out.println("Error! Not have this command number");
	}
	
	private void printFloor() {
		for (int i = 0 ; i < FLOOR_SIZE ; i++) {
			for (int j = 0 ; j < FLOOR_SIZE ; j++) {
				if (floor[i][j] == MARK) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
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
		if (RIGHT == move) {
			switch(direction) {
				case FACE_UP:
					direction = FACE_RIGHT;
					break;
				case FACE_RIGHT:
					direction = FACE_DOWN;
					break;
				case FACE_DOWN:
					direction = FACE_LEFT;
					break;
				case FACE_LEFT:
					direction = FACE_UP;
					break;
				default:
					break;
			}
		}
		else {
			switch(direction) {
				case FACE_UP:
					direction = FACE_LEFT;
					break;
				case FACE_RIGHT:
					direction = FACE_UP;
					break;
				case FACE_DOWN:
					direction = FACE_RIGHT;
					break;
				case FACE_LEFT:
					direction = FACE_DOWN;
					break;
				default:
					break;
			}
		}
	}
	
	
	private void moveForward() {
		if (PEN_DOWN == penStatus) {
			for (int i = 0 ; i < stepsNum; i++) {
				paintStars();
			}
		}
		else {
			System.out.println("Cant paint "+stepsNum+" step.\nPen is up.");
		}

	}
	
	private void paintStars() {
		try {
				switch(direction) {
					case FACE_UP:
						locationY--;
						break;
					case FACE_RIGHT:
						locationX++;
						break;
					case FACE_DOWN:
						locationY++;
						break;
					case FACE_LEFT:
						locationX--;
						break;
					default:
						break;
				}
				this.floor[locationX][locationY] = MARK;
		}
		
		catch(Exception ArrayIndexOutOfBoundsException) {
			System.out.println("Error! out from floor.");
			System.exit(1);
		}
	
	}
	
	
    interface CommandsList {
        void commands();
    }

    private CommandsList[] commandsList = new CommandsList[] {
    	new CommandsList() { public void commands() { dummy(); } },
    	new CommandsList() { public void commands() { penUP(); } },
        new CommandsList() { public void commands() { penDown(); } },
        new CommandsList() { public void commands() { right(); } },
        new CommandsList() { public void commands() { left(); } },
        new CommandsList() { public void commands() { moveForward(); } },
        new CommandsList() { public void commands() { printFloor(); } },
    };

    public void move(int index) {
    	commandsList[index].commands();
    }
    
    
    
	
	public void doCommands() {
		for (int i = 0 ; i < this.setOfCommands.length; i++) {
			
			if ( (MIN_COMMAND_NUM <= this.setOfCommands[i]) && (MAX_COMMAND_NUM >= this.setOfCommands[i])) {
				if (this.setOfCommands[i] == 5) {
					stepsNum = this.setOfCommands[i + 1];
					move(this.setOfCommands[i]);
					i++;
				}
				else {
					move(this.setOfCommands[i]); 									
				}
			}
			else if (FINNISH_COMMAND_NUM == this.setOfCommands[i]){
				System.out.println("Program terminate.");
				return;
			}
			else {
				dummy();
				return;
			}
		}		
	}

	
}
