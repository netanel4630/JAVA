
	* 			num_of_chars - size of substring to check
/**
*Comparing gets two strings from user and compares 
*if they have equal sub string.
*/ 
public class Comparing {

	/************************************************************************
	* Method:   compare_sub_string
	* Purpose:  Check if there are equal sub strings in two different strings
	* Input:    first - First string from user
	* second - Second string from user
	* Return:   boolean
	************************************************************************/
	boolean compare_sub_string(String first, String second, int num_of_chars){
		
		int smaller_num_of_chars = 0;
	
		if(first.length() > second.length()){
			smaller_num_of_chars = first.length();
		}
		
		else {
			smaller_num_of_chars = second.length();			
		}
		
		if (num_of_chars > smaller_num_of_chars) {
			return false;
		}
		
		for (int i = 0 ; i < smaller_num_of_chars - num_of_chars ; i++) {
			if (first.substring(i, i + num_of_chars).equals(second.substring(i, i + num_of_chars))) {
				return true;
			}
		}
		
		return false;
	}
}
