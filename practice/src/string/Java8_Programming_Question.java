package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8_Programming_Question
{
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*************Find Occurrence of character in a String******************   */
		
		String input = "ilovejavatechie";
		System.out.println("Original String : "+input);
		String[] inputInAnArray = input.split("");
		Map<String, Long> finalOccurence = Arrays.stream(inputInAnArray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Response : " + finalOccurence);
		
		/*************Find Duplicate Elements in a String******************   */
		
		Map<String, Long> elementsAndItsCount = Arrays.stream(inputInAnArray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<String> duplicateElements = elementsAndItsCount.entrySet().stream().filter(element -> element.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("All those character which are duplicate : "+duplicateElements);
		
		
		/*************Find All Unique Elements in a String******************   */
		
		
		List<String> uniqueElements = elementsAndItsCount.entrySet().stream().filter(element -> element.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("All those character which are unique : "+uniqueElements);
		
		/**************************** Find First Non Repeat Character in a String ***************************/
		
		Map<String, Long> elementsAndItsCount2 = Arrays.stream(inputInAnArray)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
		
		/**
		 *   --) In elementsAndItsCount2 object we have to externally pass LinkedHashMap object.
		 *   --) The Reason Behind is grouping by internally use normal hashMap.
		 *   --) so order will be distorted and we will not be able to know the first repeating character.
		 *   --) Thats why we have to externally pass LinkedHashMap object.
		 */
		
		String  firstFirstNonRepeatCharacter = elementsAndItsCount2.entrySet().stream().filter(element -> element.getValue() == 1)
				.findFirst().get().getKey();
		
		System.out.println("First Non Repeat character  : " +firstFirstNonRepeatCharacter);
		
		/**************************** Find First  Repeat Character in a String ***************************/
		
		String  firstFirstRepeatingCharacter = elementsAndItsCount2.entrySet().stream().filter(element -> element.getValue() > 1)
				.findFirst().get().getKey();
		
		System.out.println("First  Repeating character  : " +firstFirstRepeatingCharacter);
		
		/******* Java Program to find 2nd Highest Number from the given array *********/
		
		int[] numbers = {5,9,2,8,21,1,20};
		System.out.println("Number array : "+Arrays.toString(numbers));
		Integer secondHighestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		
		System.out.println("Second Highest Number from array : "+secondHighestNumber);
		
		/******* Java Program to find  Longest String from the given array *********/
		
		String[] strArray = {"java","techie","springboot","microservices","bobthebuilder"};
	
		System.out.println(Arrays.toString(strArray));
		String longestStringInAnArray = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		
		System.out.println("Longest String In the Given Array : "+longestStringInAnArray);
		
		
		/********************** Find the numbers which starts with 1 ********************************/
		
		int[] numbers1 = {5,9,2,8,11,1,20};
		List<String> numbersInString = Arrays.stream(numbers1).boxed().map(element -> element + "")
				.filter(element -> element.startsWith("1")).collect(Collectors.toList());
		
		System.out.println("All Numbers which starts with 1 "+numbersInString);
		
		/*****************************Print first 10 numbers ***************************************/
		List<Integer> data =IntStream.range(1,10).boxed().map(n->n).collect(Collectors.toList());
		System.out.println("First 10 numbers : "+data);
		
		/*****************************Print Even Number B/W   1-10 numbers ***************************************/
		List<Integer> evenNumbers =IntStream.rangeClosed(1,10).boxed().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers :  "+evenNumbers);
	}

}


