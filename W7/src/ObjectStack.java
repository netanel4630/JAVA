
public class ObjectStack implements Stack {
	
	private static final int ZERO = 0;
	private static final int ONE = 1;
	
	private Object []stack;
	private int p; // "point" to last key in stack
	private int stackSize;
	
	public ObjectStack(int n) {
		stack = new Object[n];
		p = 0;
		stackSize = n;
	}
	
	public int size() {
		return p;
	}
	
	public boolean isEmpty() {
		if (p == ZERO) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		p = ZERO;
	}
	
	public void push( Object element ) {
		try {
			if (p == stackSize) {
				throw new StackFullException();
			}
			stack[p++] = element;
		}
		
		catch (StackFullException e) {

		}
	}
	
	public Object peek() {
		if (p == ZERO) {
			return null;
		}
		return stack[p - ONE];
	}
	
	public Object pop() {
		if (p == ZERO) {
			return null;
		}
		return stack[--p];
	
	}	
	
	public String toString()
	{
		String str="(";

		for(int i = 0; i < p; i++) {
			str += stack[i] + ",";
		}
		
		//remove the last ","
		if (p > ZERO) {
			str = str.substring(0, str.length() - 1);
		}
		
		str += ")";
		
		return str;
	}
}
