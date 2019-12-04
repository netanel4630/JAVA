
public class DoubleIntList {

	private static final int NULL = 0;
	node head = null;
	node tail = null;
	
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
	
	int deleteFirst() {
		int temp = 0;
		if(head == null) {
			head.info = temp;
			head = head.Next;
			return temp;
		}
		System.out.println("Error in deleteFirst()");
		return NULL;

	}
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
