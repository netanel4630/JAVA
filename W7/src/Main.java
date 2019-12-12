
public class Main {

	public static void main(String[] args) {
		UndoIntegerStack myStack = new UndoIntegerStack (5);
		myStack.push(1.5);
		System.out.println(myStack);
		myStack.push(2);
		System.out.println(myStack);
		myStack.undo();
		System.out.println(myStack);
		myStack.push(4);
		System.out.println(myStack);
		myStack.push(5);
		System.out.println(myStack);
		myStack.push(6);
		System.out.println(myStack);
		myStack.push(5);
		System.out.println(myStack);
		myStack.push(6);
		System.out.println(myStack);
		myStack.push(7);
		System.out.println(myStack);
		myStack.undo();
		System.out.println(myStack);
//		int i=(int)myStack.pop();
//		myStack.undo();

	}

}
