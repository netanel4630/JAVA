/*
 * Class that handle a linked list
 */
public class DoubleIntList {

	private static final int NULL = 0;
	node head = null;
	node tail = null;
	
	/************************************************************************
	* Function: addToFirst()
	* Purpose:  Add first node to list
	* Input:    info - key value
	* Return:   None
	************************************************************************/
	void addToFirst(int info) {
		if (head == null && tail == null) {
			head = new node();
			tail = head;
			head.info = info;
		} else {
			node temp = new node();
			temp.info = info;		
			temp.Next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	/************************************************************************
	* Function: addToLast()
	* Purpose:  Add last node to list
	* Input:    info - key value
	* Return:   None
	************************************************************************/
	void addToLast(int info) {
		
		if (head == null && tail == null) {
			head = new node();
			tail = head;
			head.info = info;
		} else {
			node temp = new node();
			temp.info = info;
			temp.prev = tail;
			tail.Next = temp;
			tail = temp;
		}	
	}
	
	/************************************************************************
	* Function: deleteFirst()
	* Purpose:  Delete first node from list
	* Input:    None
	* Return:   None
	************************************************************************/
	int deleteFirst() {
		int temp = 0;
		if(head != null) {
			temp = head.info;
			head = head.Next;
			return temp;
		}
		System.out.println("Error in deleteFirst()");
		return NULL;
	}
	
	/************************************************************************
	* Function: deleteLast()
	* Purpose:  Delete last node from list
	* Input:    None
	* Return:   None
	************************************************************************/
	int deleteLast() {
		int temp = 0;
		if(tail != null) {
			temp = tail.info;
			tail = tail.prev;
			return temp;
		}
		System.out.println("Error in deleteLast()");
		return NULL;			
	}
	
}