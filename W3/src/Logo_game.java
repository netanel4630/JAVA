/**
*Logo is a programming language developed in the late 1960s.
*A logo language has a graphical capability that allows you to draw complex drawings.
*The language drawing is done by a symbolic "turtle", represented by a triple arrow on the computer screen.
*Imagine a mechanical turtle walking around a room, controlled by the JAVA application.
*The turtle holds a pen in two situations, up or down.
*When the turtle moves with a pen in position down he Leaves traces.
*In this class we signify the turtle movement and mark it.
*The turtle movement will be according to the commands received.
**/
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
	private static final int FINISH_COMMAND_NUM = 9;
	private static final int MARK_COMMANDS = 5;
	
	//local arguments
	private  int penStatus;
	private  int direction;
	private  int move;
	private  int[][] floor;
	private  int[] setOfCommands;
	private  int locationX;
	private  int locationY;
	private  int stepsNum = 0;
	
	
    /************************************************************************
     * Function: Logo_game()
     * Purpose:  Constructor method.
     * Input:    setOfCommands - set of commands  
     * Return:   None
     ************************************************************************/
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
	
    interface CommandsList {
        void commands();
    }
    
    //method array
    private CommandsList[] commandsList = new CommandsList[] {
    	new CommandsList() { public void commands() { errorCommand(); } },
    	new CommandsList() { public void commands() { penUP(); } },
        new CommandsList() { public void commands() { penDown(); } },
        new CommandsList() { public void commands() { right(); } },
        new CommandsList() { public void commands() { left(); } },
        new CommandsList() { public void commands() { moveForward(); } },
        new CommandsList() { public void commands() { printFloor(); } },
    };

    /************************************************************************
     * Function: errorCommand()
     * Purpose:  This method called when command number not available.
     * Input:    None  
     * Return:   None
     ************************************************************************/
	private void errorCommand() {
		System.out.println("Error! Not have this command number");
	}
	
   /************************************************************************
    * Function: printFloor()
    * Purpose:  Print only marks in floor.
    * Input:    None  
    * Return:   None
    ************************************************************************/
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
	
   /************************************************************************
    * Function: penUP()
    * Purpose:  Change penStatus value to notify that it not possible to mark.
    * Input:    None  
    * Return:   None
    ************************************************************************/
	private void penUP() {
		penStatus = PEN_UP;
	}
	
   /************************************************************************
    * Function: penDown()
    * Purpose:  Change penStatus value to notify that it possible to mark.
    * Input:    None  
    * Return:   None
    ************************************************************************/
	private void penDown() {
		penStatus = PEN_DOWN;
	}
	
   /************************************************************************
    * Function: left()
    * Purpose:  Change move value to left.
    * Input:    None  
    * Return:   None
    ************************************************************************/
	private void left() {
		move = LEFT;
		setDirection();	
	}
	
    /************************************************************************
    * Function: right()
    * Purpose:  Change move value to right.
    * Input:    None  
    * Return:   None
    ************************************************************************/
	private void right() {
		move = RIGHT;
		setDirection() ;
	}
	
    /************************************************************************
    * Function: setDirection()
    * Purpose:  Set direction follow commands.
    * Input:    None  
    * Return:   None
    ************************************************************************/
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
	
    /************************************************************************
    * Function: moveForward()
    * Purpose:  Mark cells in floor follow commands.
    * Input:    None  
    * Return:   None
    ************************************************************************/
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
	
    /************************************************************************
    * Function: paintStars()
    * Purpose:  Move one cell in floor and mark it.
    * Input:    None  
    * Return:   None
    ************************************************************************/
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

    /************************************************************************
    * Function: doCommand()
    * Purpose:  Do command from setOfCommands
    * Input:    None  
    * Return:   None
    ************************************************************************/
    private void doCommand(int index) {
    	commandsList[index].commands();
    }
	
    /************************************************************************
    * Function: doCommands()
    * Purpose:  Do the set command from setOfCommands
    * Input:    None  
    * Return:   None
    ************************************************************************/
	public void doCommands() {
		for (int i = 0 ; i < this.setOfCommands.length; i++) {			
			if ( (MIN_COMMAND_NUM <= this.setOfCommands[i]) && (MAX_COMMAND_NUM >= this.setOfCommands[i])) {
				if (MARK_COMMANDS == this.setOfCommands[i]) {
					stepsNum = this.setOfCommands[i + 1]; // take number of steps
					doCommand(this.setOfCommands[i]);
					i++; // step over the number of steps
				}
				else {
					doCommand(this.setOfCommands[i]); 									
				}
			}
			else if (FINISH_COMMAND_NUM == this.setOfCommands[i]){
				System.out.println("Program terminate.");
				return;
			}
			else {
				errorCommand();
				return;
			}
		}		
	}
	
}
