
public class IntStack extends DoubleIntList{
	
	
	IntStack(){
		super();
	}
	
	void push(int info) {
		addToFirst(info);
	}
	
	int pop() {
		return deleteFirst();		
	}
}
