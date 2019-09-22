import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LegalParentheses chekc = new LegalParentheses(); 				
				
		if(chekc.is_string_ok("gfds(ggfds)")) {
			System.out.println("Ok");
		}
		else {
			System.out.println("Error!");
		}
			
		input.close();
	}
}
