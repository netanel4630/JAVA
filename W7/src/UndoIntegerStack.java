import java.util.ArrayList;

public class UndoIntegerStack extends IntegerStack {
	
	private static int DUMMY = 0;
	private static int POP = 1;
	private static int PUSH = 2;
	private static int ACTION_LOCATION = 1;
	private static int VALUE_LOCATION = 2;
	
	ArrayList<Integer> undoList;
	
	public UndoIntegerStack(int n) {
		super(n);
		undoList = new  ArrayList<Integer>();
	}
	
	public void push(int element) {
		undoList.add(DUMMY);
		undoList.add(PUSH);
		super.push(element);
	}
	
	public Object pop() {
		undoList.add((int)peek());
		undoList.add(POP);
		return super.pop();
	}
	
	public void undo() {
		if (undoList.get(undoList.size() - ACTION_LOCATION) == POP) {
			super.push(undoList.get(undoList.size() - VALUE_LOCATION));

		}
		else {
			super.pop();
		}
		undoList.remove(undoList.size() - VALUE_LOCATION);
		undoList.remove(undoList.size() - ACTION_LOCATION);		
	}
	
}
