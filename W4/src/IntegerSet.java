
public class IntegerSet {

	boolean  integerSet[];
	private static final int INTEGER_SET_SIZE = 100;
	
	IntegerSet(){
		integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
	}
	
	
	IntegerSet(boolean integerSet[]){
		this.integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {		
			this.integerSet[i] = integerSet[i]; //init 
		}	
	}
	
	IntegerSet(int integerSet[]){
		this.integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
		
		for(int i = 0 ; i < integerSet.length ; i++) {
			this.integerSet[integerSet[i]] = true; //init 
		}	
	}
	
	public static IntegerSet union(IntegerSet s1, IntegerSet s2) {
		boolean integerSetUnion[] = new boolean[INTEGER_SET_SIZE];
		
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if(s1.integerSet[i] || s2.integerSet[i]) {
				integerSetUnion[i] = true; 
			}
		}

		return new IntegerSet(integerSetUnion);
	}
	
	public static IntegerSet intersection(IntegerSet s1, IntegerSet s2) {
		boolean integerSetIntersection[] = new boolean[INTEGER_SET_SIZE];
		
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if(s1.integerSet[i] && s2.integerSet[i]) {
				integerSetIntersection[i] = true; 
			}
		}

		return new IntegerSet(integerSetIntersection);
	}
	
	public void insertElement(int i) {
		if (integerSet[i] == true || i > INTEGER_SET_SIZE) {
			System.out.printf("Error! in insertElement function");
		}
		else {
			integerSet[i] = true;
		}
		
	}
	

	public void deleteElement (int i) {
		if (integerSet[i] == false || i > INTEGER_SET_SIZE) {
			System.out.printf("Error! in insertElement function");
		}
		else {
			integerSet[i] = false;
		}
	}
	
	public boolean isEmpty() {
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean contains(int i) {
		if (true == integerSet[i]) {
			return true;
		}
		return false;
	}
	 
	
	public int size() {
		int cnt = 0;
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public String toString() {
		String str = "{";
			
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				str += "," + i;
			}
		}
		str = "}";
		
		return str;
		
	}
	
	public boolean isEqual(IntegerSet s) {
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (this.integerSet[i] != s.integerSet[i]) {
				return false;
			}
		}
		
		return true;
	}
	 
}
