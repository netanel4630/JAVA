import java.util.ArrayList;

public class UndoIntegerStack extends IntegerStack {
	
	private static int POP = 1;
	private static int PUSH = 2;
	
	private int undo = 0;
	private int tempUndo = 0;
	ArrayList<Integer> undoList;
	
	public UndoIntegerStack(int n) {
		super(n);
		undoList = new  ArrayList<Integer>();
	}
	
	public void push(int element) {
		undo = PUSH;
		tempUndo = element;
		super.push(element);
	}
	
	public void pop(int element) {
		undo = POP;
		tempUndo = element;
		super.push(element);
	}
	
	public void undo() {
		
		if (undo == POP) {
			super.push(tempUndo);
		}
		else {
			super.pop();
		}
	}
	
}
