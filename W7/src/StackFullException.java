/*
 * Class for handle exception if stack full
 */
public class StackFullException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackFullException( ) {
		System.out.println("StackFullException");
	}
}
