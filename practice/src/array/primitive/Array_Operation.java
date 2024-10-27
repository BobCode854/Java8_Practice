package java8.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Operation {

	public static void main(String[] args) {
	
		
		int arr[] = {55,1,2,3,4,22,65,22,55};
		
		// **. Find Size of the array
		long totalCountofElements = Arrays.stream(arr).count();
		System.out.println("TotalCount : "+totalCountofElements);
		
		// ** . Find maximum value in an aray.
		     int maxValue  = Arrays.stream(arr).max().getAsInt();
		     System.out.println("MaxValue  :"+maxValue);
		     
	   // ** . Min Value
		     int minValue = Arrays.stream(arr).min().getAsInt();
		     System.out.println("Min Value : "+minValue);
		     
  
		 	// **. Find the Sum of the length of character of those names whose length is greater than 5.
			    String[] names = {"william", "jones", "aaron", "seppe", "frank", "gilliam"};
			  int sum =  Arrays.stream(names).filter(name->name.length()>5).mapToInt(name->name.length()).sum();
		       System.out.println("Sum : "+sum);
		      
		    // **. Find the Sum of the data in an array
		       int[] numbers = {7,5,3,4};
		       int sumOfNumbersInAnArray =  Arrays.stream(numbers).sum();
		       System.out.println("sumOfNumbersInAnArray : " +sumOfNumbersInAnArray);
		       
		       
		       //**. Perform the sum of array using reduce method containing 3 parameter
		       int sumUsingReduceWith3Param =Arrays.stream(numbers).reduce(0, (num1,num2)->num1+num2); // this will return int
		       System.out.println("sumUsingReduceWith3Param :"+sumUsingReduceWith3Param);
		       
		       // **. Perform the sum of array using reduce method containing 2 parameter
		       int sumUsingReduceWith2Param =Arrays.stream(numbers).reduce((num1,num2)->num1+num2).getAsInt(); // this will return optionalInt
		       System.out.println("sumUsingReduceWith2Param : "+sumUsingReduceWith2Param);
		       
		       // **. Finding duplicate element from array
		       
		       List<Integer> findingDuplicates = Arrays.asList(new Integer[]{1,2,1,3,4,4});
		       Set<Integer> allItems = new HashSet<>();
		       Set<Integer> duplicates = findingDuplicates.stream()
		    	        .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
		    	        .collect(Collectors.toSet());
		    	System.out.println(duplicates); 
			}
	 
	}

}
