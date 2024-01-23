
/*
Remove the duplicates from a given String with better time Complexity :

String input = "aaaaBbBBBbCDdefghiIIiJ";*/

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {

	public static void main(String[] args) {
		String input = "aaaaBbBBBbCDdefghiIIiJ";
		Set<Character> setchar = new HashSet<>();
		String output = "";
		for(int i=0;i<input.length();i++) {
			if(setchar.add(input.charAt(i))) {
				output = output + input.charAt(i);
			}
		}
		
		System.out.println(output);
		
				
				
	}
}
