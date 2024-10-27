package java8.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_Duplicate_String {

	public static void main(String[] args) {

		// Using distinct method
		
		String s[] = { "RAM", "Karan", "RAM", "Shyam" };
		List<String> notDuplicateUsingDistinctMethod = Arrays.asList(s).stream().distinct().collect(Collectors.toList());
		System.out.println(notDuplicateUsingDistinctMethod);
		
		
		// Using set interface
		Set<String> data=new HashSet<>();
		Set<String> nonDuplicateUsingSet =  Arrays.asList(s).stream().filter(element->data.add(element)).collect(Collectors.toSet());
		System.out.println(nonDuplicateUsingSet);

	}

}
