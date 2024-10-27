package java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

interface A
{
	public int reduce(int a , int b);
}   


class Client
{
	public static void main(String args[]) {
	A a =	 (int data1,int data2) ->  data1+data2;
	}
}

public class PlayingWithMap2 {

	public static void main(String[] args)
	{
	 Map<Integer,String> map = new HashMap();
	 map.put(1, "Anusha");
	 map.put(2, "Karan");
	 map.put(3, "Amit");
	 map.put(4, "Nihar");
	 map.put(7, "Shephali");
	 map.put(6, "Navin");
	 map.put(5, "Anusha");
	 



	 
	 Set<Integer> listData = map.entrySet().stream().filter(entry -> entry.getValue().startsWith("A")).map(entry->entry.getKey()).collect(Collectors.toSet());
		System.out.println("listData "+listData);
		
		List<Object> data =map.entrySet().stream().filter(entry -> entry.getValue().startsWith("N") && entry.getValue().length()>=5).collect(Collectors.toList());
		System.out.println(data);
		
		//sum of all keys
		
		map.keySet().stream().reduce((a,b) -> a+b);
		
		//sum of length of values
		//1 . get all the values 2. length of the values 3. sum of the length of the values
		int sumOfLengthOfValue = map.entrySet().stream().map(entry -> entry.getValue()).map(value->value.length()).reduce((a,b) -> a+b).get();
		System.out.println(sumOfLengthOfValue);
		
		/**
		 *  Sorting based on values
		 *  ======================
		 *  1) Get the values
		 *  2) I have to sort
		 *  3) Ascending or descending
		 */
		
	}

}
