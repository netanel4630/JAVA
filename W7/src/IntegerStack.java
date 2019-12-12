/*
 * Class for handle stack with Integer elements 
 */
public class IntegerStack extends ObjectStack{
	
	public IntegerStack(int n) {
		super(n);
	}
	
	/************************************************************************
	* Function: push()
	* Purpose:  Push element to stack and check if element is Integer
	* Input:    element - key
	* Return:   None
	************************************************************************/
	public void push( Object element ) {
		try {
			if (!(element instanceof Integer )) {
				throw new InputMismatchException(); 
			}
			super.push(element);
		}
		
		catch (InputMismatchException e) {

		}
	}
}
