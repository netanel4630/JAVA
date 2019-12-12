
public class ObjectStack implements Stack {
	
	private static final int ZERO = 0;
	
	private Object []stack;
	private int p; // "point" to last key in stack
	private int stackSize;
	
	public ObjectStack(int n) {
		stack = new Object[n];
		p = 0;
		stackSize = n - 1;
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
			if (p + 1 > stackSize) {
				throw new StackFullException();
			}
			stack[p] = element;
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
		return stack[p + 1];
	
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
