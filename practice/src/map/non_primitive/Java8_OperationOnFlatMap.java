package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_OperationOnFlatMap {

	public static void main(String[] args) 
	{
		List<List<String>> collection = Arrays.asList(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third"));
		List<String> listOfStringInFlatStructure =    transform(collection);
		System.out.println("listOfStringInFlatStructure : "+listOfStringInFlatStructure);
	}
	
	public static List<String> transform(List<List<String>> collection) {
		List<String> newCollection = new ArrayList<>();
	   newCollection = collection.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		return newCollection;
	}
	
	

}
