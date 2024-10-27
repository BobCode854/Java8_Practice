package java8.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {

	/**
	 *   
	 *  ========================Ques ====================================
	 *  
	 *  Using Java8 find the occurence of a specific character
	 *  
	 *  input  : Hello World and l 
	 *  output  : 3
	 *  
	 *  Using Java8 find the occurence of a every character
	 *  
	 */
	public static void main(String[] args) 
	{
  // Way 1 : Using Java8 find the occurence of a specific character
		
	String string = "Hello World";

	char targetChar = 'l';
	long count = string.chars().filter(character-> character == targetChar).count();
	System.out.println("count using array count method: "+count);
	
	// Way 2  : Using Collections.frequency
	List<String> listString = Arrays.asList(string.split(""));
	int frequency = Collections.frequency(listString, String.valueOf(targetChar));
	System.out.println("count using Frequency : "+frequency);
	
	// Using Java8 find the occurence of a every character
	
	Map<String,Long> elementsAndItsCount = listString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(elementsAndItsCount);
	}

}
