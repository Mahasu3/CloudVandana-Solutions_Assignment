package Java;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {

    public static int romanToInt(String s) {

        if (s == null || s.length() == 0)
            return -1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length(), result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }

        System.out.println("Integer: " + result);
        return result;
    }

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	String roman=scan.nextLine();
    	romanToInt(roman);
    	
        
    }
}