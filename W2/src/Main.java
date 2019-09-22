import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LegalParentheses chekc = new LegalParentheses(); 				
		
		System.out.println("Enter a sentence with parentheses");
		
		String input_from_user = input.nextLine(); 
		
		if(chekc.is_string_ok(input_from_user)) {
			System.out.println("Ok");
		}
		else {
			System.out.println("Error!");
		}
			
		input.close();
	}
}
