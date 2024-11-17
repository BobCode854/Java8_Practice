package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Java8_Find_Nth_Highest_Salary {

	public static void main(String[] args) 
	{
       Map<String,Integer> nameToSalMapping = new HashMap<>();
       nameToSalMapping.put("anil", 1000);
       nameToSalMapping.put("brijesh", 5500);
       nameToSalMapping.put("karan", 100000);
       nameToSalMapping.put("amir", 4000);
       nameToSalMapping.put("deepanshu", 6600);
       nameToSalMapping.put("ankit", 55000);
       nameToSalMapping.put("daniel", 1700);
       nameToSalMapping.put("james", 4400);
       

       System.out.println("************************Saalry Information ******************************************************");
       nameToSalMapping.entrySet().forEach(System.out::println);
       System.out.println("******************************************************************************");
       System.out.println("Enter which Highest salary you want : ");
     
       Integer NthHighestSaalry = findNthHighestSalary(nameToSalMapping,2);
       System.out.println(NthHighestSaalry);
      
      Map.Entry<String,Integer> NthHighest = findNthHighestSalaryMethod2(nameToSalMapping,2);
      System.out.println("Here is the object information of 2nd Highest salary");
      System.out.println(NthHighest);
      
      
      System.out.println("============================================================================");
     
      Map<String,Integer> nameToSalMappingDuplicateSaalry = new HashMap<>();
      nameToSalMappingDuplicateSaalry.put("anil", 1000);
      nameToSalMappingDuplicateSaalry.put("brijesh", 5500);
      nameToSalMappingDuplicateSaalry.put("karan", 100000);
      nameToSalMappingDuplicateSaalry.put("amir", 4000);
      nameToSalMappingDuplicateSaalry.put("deepanshu", 100000);
      nameToSalMappingDuplicateSaalry.put("ankit", 55000);
      nameToSalMappingDuplicateSaalry.put("daniel", 55000);
      nameToSalMappingDuplicateSaalry.put("james", 4400);
      
      nameToSalMappingDuplicateSaalry.entrySet().forEach(System.out::println);
      System.out.println("******************************************************************************");
      
     Map. Entry<Integer, List<String>> NthHighestNew = findNthHighestSalaryMethodHandlingDuplicateData(nameToSalMappingDuplicateSaalry,2);
      System.out.println("Here is the object information of 2nd Highest salary Where we are considering duplicate element also");
      System.out.println(NthHighestNew);
	}
	
	// This is one way where you are getting only value as Integer
	public static Integer findNthHighestSalary(Map<String, Integer> nameToSalMapping, int number) {
		return nameToSalMapping.entrySet().stream().map(mapObject -> mapObject.getValue())
				.sorted(Comparator.reverseOrder()).skip(number - 1).findFirst().get();
	}
	
	// Another way
	public static Map.Entry<String, Integer> findNthHighestSalaryMethod2(Map<String, Integer> nameToSalMapping,
			int number) {
		return nameToSalMapping.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList())
				.get(number - 1);

	}
	
// Another way for scenario where different peoplw have same salary .At that point of time our code will fail . So we have to return all entries for that salary.
	public static  Map.Entry<Integer, List<String>> findNthHighestSalaryMethodHandlingDuplicateData(Map<String, Integer> nameToSalMapping,
			int number) {
		// If we will group the data based on salary we will get this result.
		Map<Integer, List<String>> salaryToNameMapping = nameToSalMapping.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		
		/**
		 *   Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())
		 *   
		 *   // First Statement :  Map.Entry::getValue    // this will define key in map ,
		 *   // Second  statement :  Collectors.mapping(Map.Entry::getKey, Collectors.toList()) // This is telling how we want value.
		 *    //  Map.Entry::getKey  :  With this one we informed that for value we dont want  entire map object but only key . 
		 *                                              Note : If you will not provide, it will give you entire map object as map value
		 *                                              
		 *    // Collectors.toList()  : With this one we are informing we want once object grouping will be done in the form of list object . 
		 *                                           So that nth salary  we can find via index .
		 */

	System.out.println("salaryToNameMapping : "+salaryToNameMapping);
	
	// now if we will convert the result for sorting we will get the result.
	return salaryToNameMapping.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList()).get(number-1);
	
	
	}
}
