import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Sorting_Two_UnSorted_Array {

	public static void main(String[] args)
	{
		
		List<Integer> evenNumbers = Arrays.asList(2,4,6,8);
		List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9);
		List<Integer> finalArray = new ArrayList<>();
		finalArray.addAll(oddNumbers);
		finalArray.addAll(evenNumbers);
		
		finalArray = finalArray.stream().sorted((element1,element2)->element1.compareTo(element2)).collect(Collectors.toList());
		
		System.out.println(finalArray);
		
	}

}
