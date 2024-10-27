package java8.string;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *     Ques : Numeral String INput is there we have to tell whether number is consective or not.
 */
public class NumeralStringInput {

	
	public static boolean isConsecutiveUsingJava8(String str) {
        int n = str.length();
        
        // Check possible lengths for the starting number
        return IntStream.range(1, n / 2 + 1)
                .filter(len -> !str.startsWith("0") || len == 1) // Skip lengths with leading zeros
                .anyMatch(len -> {
                    String firstNumStr = str.substring(0, len);
                    int firstNum = Integer.parseInt(firstNumStr);
                    String generated = generateSequence(firstNum, n, len);
                    return generated.equals(str);
                 });
    }
	 private static String generateSequence(int start, int length, int numLength) {
	        StringBuilder sb = new StringBuilder();
	        IntStream.range(0, length / numLength + 1)
	                .map(i -> start + i)
	                .forEach(num -> sb.append(num));
	        return sb.toString().substring(0, length);
	    }
	 //It is failing in 101112
	public static boolean isConsecutive(String str) {
        int stringLength = str.length();     
        // Try every possible length for the first number in the sequence
        for (int len = 1; len <= stringLength / 2; len++) {
            String firstNumStr = str.substring(0, len);
            if (firstNumStr.startsWith("0") && firstNumStr.length() > 1) {
                continue; // Skip if the number has leading zeros
            }
            
            // Parse the first number
            int firstNum = Integer.parseInt(firstNumStr);
            StringBuilder sb = new StringBuilder();
             
            // Generate the consecutive sequence
            for (int i = 0; i < stringLength; i++) {
                sb.append(firstNum + i);
            }
            
            // Compare the generated sequence with the input string
            if (sb.toString().equals(str)) {
                return true;
            }
        }
        
        return false;
    }
	public static void main(String[] args) 
	{
		System.out.println("Enter a Numeral String");
	
       Scanner sc = new Scanner(System.in);
       String consecutiveCheck  = sc.next();
       boolean isConsecutive = isConsecutive(consecutiveCheck);
       System.out.println(isConsecutive);
	}

}
