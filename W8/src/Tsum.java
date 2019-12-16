/*
 * Class that add 1 to sum and print it.
 * Works in sync with the other Threads.
 */
public class Tsum  extends Thread {
	
	private static final long SUM = 100000;
	private static long sum = 0;
	
	/************************************************************************
	* Function: run()
	* Purpose:  Call the function sum until sum argument is equal to SUM value
	* Input:    None
	* Return:   None
	************************************************************************/
	public void run() {
		while (SUM != sum) {
			sum();
		}	
	}
	
	/************************************************************************
	* Function: sum()
	* Purpose:  Add 1 to sum argument
	* Input:    None
	* Return:   None
	************************************************************************/
	private synchronized void sum() {
		sum++;
	}
	
	/************************************************************************
	* Function: printSum()
	* Purpose:  Print sum argument
	* Input:    None
	* Return:   None
	************************************************************************/
	public static void printSum() {
		System.out.println(sum);
	}
}
