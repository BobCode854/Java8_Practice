package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Java8_Playing_With_Map {

	public static void main(String[] args) {
	
		  Map<String,Integer> nameToSalMapping = new HashMap<>();
	       nameToSalMapping.put("anil", 1000);
	       nameToSalMapping.put("brijesh", 5500);
	       nameToSalMapping.put("karan", 100000);
	       nameToSalMapping.put("amir", 4000);
	       nameToSalMapping.put("deepanshu", 6600);
	       nameToSalMapping.put("ankit", 55000);
	       nameToSalMapping.put("daniel", 1700);
	       nameToSalMapping.put("james", 4400);
	 
	     
 //Ques 1:  Sorting based on Key Wise Ascending order
	       System.out.println("****************Map Object Key Wise Ascending Order Sorting ****************************");  
	       /** Solution 1  : Create a treeMap and pass this map object .It will sort based on Key only  **/
	       
	       Map<String, Integer> sortedMapByKeyFirstWay = new TreeMap<>(nameToSalMapping);
	       System.out.println(sortedMapByKeyFirstWay);
	     
	       /** Solution 2  : Convert it to entrySet and pass Java provided method Map.Entry:: comparingByKey **/
	       
	       List<Entry<String, Integer>> sortedMapByKeySecondWay = nameToSalMapping.entrySet()
	    	        .stream()
	    	        .sorted(Map.Entry.comparingByKey())
	    	        .collect(Collectors.toList());	       
	      System.out.println(sortedMapByKeySecondWay); 
	      
	      /** Solution 3  : Convert it to entrySet and pass Java provided method Map.Entry:: comparingByKey and accept in map object **/
	    
	      List<Entry<String, Integer>> sortedMapByKeyThirdWay = nameToSalMapping.entrySet()
	    	        .stream()
	    	        .sorted(Comparator.comparing(Map.Entry::getKey))
	    	        .collect(Collectors.toList());	       
	      System.out.println(sortedMapByKeyThirdWay);  
	      
	 //Ques 2:  Sorting based on Key Wise Descending order      
	    
	      System.out.println("****************Map Object Key Wise Descending Order Sorting ****************************");
	      /** Solution 1  : Create a treeMap and pass this map object .It will sort based on Key only  **/
	       
	       Map<String, Integer> sortedMapByKeyFirstWayDescendingOrder = new TreeMap<>(Comparator.reverseOrder());
	       sortedMapByKeyFirstWayDescendingOrder.putAll(nameToSalMapping);
	       System.out.println(sortedMapByKeyFirstWayDescendingOrder);
	     
	       /** Solution 2  : Convert it to entrySet and pass Java provided method Map.Entry:: comparingByKey **/
	       
	       List<Entry<String, Integer>> sortedMapByKeySecondWayDescendingOrder = nameToSalMapping.entrySet()
	    	        .stream()
	    	        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    	        .collect(Collectors.toList());	       
	      System.out.println(sortedMapByKeySecondWayDescendingOrder); 
	      
	      /** Solution 3  : Convert it to entrySet and pass Java provided method Map.Entry:: comparingByKey and accept in map object **/
	    
//	      nameToSalMapping.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList())
//			.get(number - 1);
	      
	      List<Entry<String, Integer>> sortedMapByKeyThirdtWayDescendingOrder = nameToSalMapping.entrySet()
	    	        .stream()
	    	        .sorted(Comparator.comparing(Map.Entry::getKey,Comparator.reverseOrder()))
	    	        .collect(Collectors.toList());	       
	      System.out.println(sortedMapByKeyThirdtWayDescendingOrder); 
	  
	      /** Solution 4  : Convert it to entrySet and pass Java provided method Map.Entry:: comparingByKey and accept in map object **/      
	      List<Entry<String, Integer>> sortedMapByKeyFourthWayDescendingOrder = nameToSalMapping.entrySet()
	    	        .stream()
	    	        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
	    	        .collect(Collectors.toList());	       
	      System.out.println(sortedMapByKeyFourthWayDescendingOrder); 
	      

	}

}
