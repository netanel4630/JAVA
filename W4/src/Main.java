
public class Main {

	public static void main(String[] args) {
		 int array[] = {0,2,4,6,10};
		 IntegerSet s1 = new IntegerSet();
		 IntegerSet s2 = new IntegerSet(array);
		 s1.insertElement(0);
		 s1.insertElement(1);
		 s1.insertElement(3);
		 s1.insertElement(5);
		 s1.deleteElement(5);
		 s1.insertElement(6);
		 s1.insertElement(6);
		 System.out.println("Set s1 cointains " + s1.size() +" elements");
		 System.out.println("Set s2 cointains " + s2.size() +" elements");
		 if (s1.isEqual(s2))
			 System.out.println("The sets s1 and s2 are equal");
		 else 
			 System.out.println("The sets s1 and s2 are not equal");
		 System.out.println("The union set of s1 and s2 is " + IntegerSet.union(s1,s2));
		 System.out.println("The intersection set of s1 and s2 is "+ IntegerSet.intersection(s1,s2));   
	}

}
