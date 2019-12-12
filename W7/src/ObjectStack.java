/*
 * Class for handle stack
 */
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
	
	/************************************************************************
	* Function: size()
	* Purpose:  Return the number of elements in stack
	* Input:    None
	* Return:   element - key
	************************************************************************/
	public int size() {
		return p;
	}
	
	/************************************************************************
	* Function: isEmpty()
	* Purpose:  Check if stack is empty
	* Input:    None
	* Return:   Boolean
	************************************************************************/
	public boolean isEmpty() {
		if (p == ZERO) {
			return true;
		}
		return false;
	}
	
	/************************************************************************
	* Function: clear()
	* Purpose:  Clear the stack
	* Input:    None
	* Return:   None
	************************************************************************/
	public void clear() {
		p = ZERO;
	}
	
	/************************************************************************
	* Function: push()
	* Purpose:  Push element
	* Input:    element - key
	* Return:   None
	************************************************************************/
	public void push( Object element ) {
		try {
			if (this.size() == stackSize) {
				throw new StackFullException();
			}
			stack[p++] = element;
		}
		
		catch (StackFullException e) {

		}
	}
	
	/************************************************************************
	* Function: peek()
	* Purpose:  Pop element without out it from stack
	* Input:    None
	* Return:   element - key
	************************************************************************/
	public Object peek() {
		if (p == ZERO) {
			return null;
		}
		return stack[p - ONE];
	}
	
	/************************************************************************
	* Function: pop()
	* Purpose:  Pop element
	* Input:    None
	* Return:   element - key
	************************************************************************/
	public Object pop() {
		if (p == ZERO) {
			return null;
		}
		return stack[--p];
	
	}	
	
	/************************************************************************
	* Function: toString()
	* Purpose:  Print the stack
	* Input:    None
	* Return:   String
	************************************************************************/
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
