
public class Main {
	private static final int NUM_OF_THREAD = 10;
	
	public static void main(String[] args) {
		
		Tsum []tAraay = new Tsum[NUM_OF_THREAD];
		
		for(int i = 0; i < NUM_OF_THREAD; i++) {
			tAraay[i] = new Tsum();
		}
		
		for(int i = 0; i < NUM_OF_THREAD; i++) {
			tAraay[i].start();
		}
		
		try {
			for(int i = 0; i < NUM_OF_THREAD; i++) {
				tAraay[i].join();
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		Tsum.printSum();

	}

}