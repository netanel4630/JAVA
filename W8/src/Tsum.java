
public class Tsum  extends Thread {
	
	private static final long SUM = 100000;
	private static long sum = 0;
	
	public void run() {
		while (sum != SUM) {
			sum();
		}	
	}
	
	private synchronized void sum() {
		sum++;
	}
	
	public static void printSum() {
		System.out.println(sum);
	}
}
