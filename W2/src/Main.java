import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		LegalParentheses check = new LegalParentheses(); 				
//		
//		System.out.println("Enter a sentence with parentheses");
//		
//		String input_from_user = input.nextLine(); 
//		
//		if(check.is_string_ok(input_from_user)) {
//			System.out.println("The sentence is legal");
//		}
//		else {
//			System.out.println("Error! The sentence is illegal");
//		}
//			
//		input.close();
		
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		Comparing compare_string = new Comparing();
		
		System.out.println("Enter sentence");
		String input_from_user1 = input1.nextLine(); 
		System.out.println("Enter anoter sentence");
		String input_from_user2 = input2.nextLine();
		System.out.println("Enter nuber");
		int input_from_user3 = input3.nextInt(); 
		
		if(compare_string.compare_sub_string(input_from_user1, input_from_user2, input_from_user3)) {
			System.out.println("The sub sentences are equal");
		}
		else {
			System.out.println("Error! The sub sentences are not equal");
		}
	
	}
}
