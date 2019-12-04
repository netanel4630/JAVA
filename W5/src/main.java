
public class main {

	public static void main(String[] args) {
		int first, last, i, n;
		DoubleIntList doubleIntList = new DoubleIntList();
		n = 10;
		for(i=0; i < n; i++)
			if((i % 2) == 0)
				doubleIntList.addToFirst(i);
			else
				doubleIntList.addToLast(i); 
		 
	     System.out.println("Generated List:");
	     
	     for(i=0; i < n; i++){
	    	 System.out.println(doubleIntList.deleteLast());
	    	 }
	}

}
