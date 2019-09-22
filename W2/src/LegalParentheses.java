
/**
*LegelParentheses receiving from the user string and prints Legal if the string is a valid-string-parenthesis
*otherwise prints Illegal.
*/
public class LegalParentheses {
	
	/************************************************************************
	* Method:   is_string_ok
	* Purpose:  Check if for all "(" there is ")".
	* Input:    check - String from user
	* Return:   boolean
	************************************************************************/
	public boolean is_string_ok(String check) {
		
		int cnt_open = 0;
		int cnt_close = 0;
		boolean overflow = true;
		int check_open = 0;
		int check_close = check.length() - 1;

		while (overflow) {
			check_open = check.indexOf("(", check_open);
			if (check_open >= 0) {
				cnt_open++;
				check_close = check.lastIndexOf(")",check_close);
				if (check_close > check_open){
					cnt_close++;
				}
				check_open++;
				check_close--;
			}
			
			if (check_open >= check_close || check_open < 0 || check_close < 0) {
				overflow = false;
			}
		}
		
		if (cnt_open == cnt_close) {
			return true;
		}
		
		return false;
	}
	
}
