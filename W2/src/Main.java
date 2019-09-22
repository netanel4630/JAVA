import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Initial arguments and instances
		Scanner input = new Scanner(System.in);				
		LegalParentheses check = new LegalParentheses();
		Comparing compare_string = new Comparing();	
		String input_sentence_with_parentheses_from_user;
		String input_first_string_to_check_substring_from_user; 
		String input_second_string_to_check_substring_from_user;
		int size_of_substring_to_check_from_user;
		
		//Use LegalParentheses class
		System.out.println("Enter a sentence with parentheses");	
		input_sentence_with_parentheses_from_user = input.nextLine(); 
		
		if(check.is_string_ok(input_sentence_with_parentheses_from_user)) {
			System.out.println("The sentence is legal");
		}
		else {
			System.out.println("Error! The sentence is illegal");
		}
			
		//Use Comparing class
		System.out.println("Enter sentence");
		input_first_string_to_check_substring_from_user = input.nextLine(); 
		System.out.println("Enter anoter sentence");
	    input_second_string_to_check_substring_from_user = input.nextLine();
		System.out.println("Enter number");
		size_of_substring_to_check_from_user = input.nextInt(); 
		
		if(compare_string.compare_sub_string(input_first_string_to_check_substring_from_user, input_second_string_to_check_substring_from_user, size_of_substring_to_check_from_user)) {
			System.out.println("The sub sentences are equal");
		}
		else {
			System.out.println("Error! The sub sentences are not equal");
		}
			
		input.close();
	}
}
