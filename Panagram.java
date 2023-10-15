package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String input=scan.nextLine();
		
		boolean res = isPanagram(input);
		
		if(res) System.out.println("panagram");
		else System.out.println("not panagram");
		
		
	}

	private static boolean isPanagram(String input) {
		
		input=input.toLowerCase();
		
	Set<Character> set = new HashSet<Character>();
	
	for(int i=0;i<input.length();i++) {
		
		char c=input.charAt(i);
		
		if(c>='a' && c<='z') set.add(c);
	}
		
		
		return set.size()==26;
	}

}
