
public class ObjectStack implements Stack {
	
	private static final int ZERO = 0;
	
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
		return true;
	}
	
	public void clear() {
		p = ZERO;
	}
	
	public void push( Object element ) {
		try {
			stack[p + 1] = element;
			p++;
		}
		
		catch (StackFullException e) {
			
		}
	}
	
	public Object peek() {
		if (p == ZERO) {
			return null;
		}
		return stack[p];
	}
	
	public Object pop() {
		if (p == ZERO) {
			return null;
		}
		p--;
		return stack[p + 1]
	}
}
