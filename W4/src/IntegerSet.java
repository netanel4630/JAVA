
public class IntegerSet {

	boolean  integerSet[];
	private static final int INTEGER_SET_SIZE = 100;
	
	public IntegerSet(){
		integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
	}
	
	
	public IntegerSet(boolean integerSet[]){
		this.integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {		
			this.integerSet[i] = integerSet[i]; //init 
		}	
	}
	
	public IntegerSet(int integerSet[]){
		this.integerSet = new boolean [INTEGER_SET_SIZE]; //init all to false
		
		for(int i = 0 ; i < integerSet.length ; i++) {
			this.integerSet[integerSet[i]] = true; //init 
		}	
	}
	
	/************************************************************************
	* Function: union()
	* Purpose:  Return new IntegerSet that contain all the elements from s1, s2
	* Input:    s1 - IntegerSet, s2 - IntegerSet
	* Return:   New IntegerSet that contain elements from s1, s2
	************************************************************************/
	public static IntegerSet union(IntegerSet s1, IntegerSet s2) {
		boolean integerSetUnion[] = new boolean[INTEGER_SET_SIZE];
		
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if(s1.integerSet[i] || s2.integerSet[i]) {
				integerSetUnion[i] = true; 
			}
		}

		return new IntegerSet(integerSetUnion);
	}

	/************************************************************************
	* Function: intersection()
	* Purpose:  Return new IntegerSet that contain all the intersection 
	*			elements from s1, s2
	* Input:    s1 - IntegerSet, s2 - IntegerSet
	* Return:   New IntegerSet that contain all intersection elements from s1, s2
	************************************************************************/
	public static IntegerSet intersection(IntegerSet s1, IntegerSet s2) {
		boolean integerSetIntersection[] = new boolean[INTEGER_SET_SIZE];
		
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if(s1.integerSet[i] && s2.integerSet[i]) {
				integerSetIntersection[i] = true; 
			}
		}

		return new IntegerSet(integerSetIntersection);
	}
	
	/************************************************************************
	* Function: insertElement()
	* Purpose:  Insert element to integerSet 
	* Input:    i - new element
	* Return:   None
	************************************************************************/
	public void insertElement(int i) {
		if (integerSet[i] == true || i > INTEGER_SET_SIZE) {
			System.out.printf("Error! in insertElement function.\n");
		}
		else {
			integerSet[i] = true;
		}
		
	}
	
	/************************************************************************
	* Function: insertElement()
	* Purpose:  Delete element from integerSet 
	* Input:    i - element to delete
	* Return:   None
	************************************************************************/
	public void deleteElement (int i) {
		if (integerSet[i] == false || i > INTEGER_SET_SIZE) {
			System.out.printf("Error! in insertElement function");
		}
		else {
			integerSet[i] = false;
		}
	}
	
	/************************************************************************
	* Function: isEmpty()
	* Purpose:  Check if integerSet empty 
	* Input:    None
	* Return:   None
	************************************************************************/
	public boolean isEmpty() {
		for(int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	/************************************************************************
	* Function: contains()
	* Purpose:  Check if integerSet contain element i
	* Input:    i - element to check
	* Return:   None
	************************************************************************/
	public boolean contains(int i) {
		if (true == integerSet[i]) {
			return true;
		}
		return false;
	}
	 
	
	/************************************************************************
	* Function: size()
	* Purpose:  Check size of integerSet
	* Input:    None
	* Return:   None
	************************************************************************/
	public int size() {
		int cnt = 0;
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	/************************************************************************
	* Function: toString()
	* Purpose:  Print integerSet
	* Input:    None
	* Return:   None
	************************************************************************/
	public String toString() {
		String str = "{";
			
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (true == integerSet[i]) {
				str += i + ",";
			}
		}
		
		str = str.substring(0, str.length() - 1); //delete the last ','
		str += "}";

		return str;
		
	}
	
	/************************************************************************
	* Function: isEqual()
	* Purpose:  Check if integerSet s is equal to this integerSet
	* Input:    s - integerSet
	* Return:   None
	************************************************************************/
	public boolean isEqual(IntegerSet s) {
		for (int i = 0 ; i < INTEGER_SET_SIZE ; i++) {
			if (this.integerSet[i] != s.integerSet[i]) {
				return false;
			}
		}
		
		return true;
	}
	 
}
