/*
 * Class that handle stack
 */
public class IntStack extends DoubleIntList{
	
	IntStack() {
		super();
	}
	
	/************************************************************************
	* Function: push()
	* Purpose:  Add first node to list
	* Input:    info - key value
	* Return:   None
	************************************************************************/
	void push(int info) {
		addToFirst(info);
	}
	
	/************************************************************************
	* Function: pop()
	* Purpose:  Delete first node from list
	* Input:    None
	* Return:   None
	************************************************************************/
	int pop() {
		return deleteFirst();		
	}
	
}