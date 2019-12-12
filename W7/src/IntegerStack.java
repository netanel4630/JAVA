
public class IntegerStack extends ObjectStack{
	
	public IntegerStack(int n) {
		super(n);
	}
	
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
