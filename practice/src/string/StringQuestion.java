import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringQuestion {

	public static void main(String[] args)
	{
		// Reverse Given String
		// Way 1
		String s ="hello";
		String s1 = IntStream.range(0, s.length()).           // create index [0 .. s.length - 1] 
		   boxed().                               // the next step requires them boxed
		   sorted(Collections.reverseOrder()).    // indices in reverse order
		   map(i -> String.valueOf(s.charAt(i))). // grab each index's character 
		   collect(Collectors.joining()); 
		
		System.out.println(s1);
		
		//Way 2
		String s2 = Arrays.asList(s.split("")).stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());
		System.out.println(s2);
		
		//Reverse String from a Sentence
		
		String name = "My name is Karan";
		List<String> data = Arrays.asList(name.split(" "));
		Collections.reverse(data);
		String reverseName = data.stream().collect(Collectors.joining(" "));
		System.out.println(reverseName);
		
		// Find the Occurence of each character
		  System.out.println("Elements and its occurence in HonnoLuLu : " );
		String str = "HonnoLuLu";
		
		List<String> stringAsList = Arrays.asList(str.split(""));
		//way 1
		Map<String,Long> elementAndItsOccurence = stringAsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(elementAndItsOccurence);
		
		String input = "aabbccc";
		String output="a2b2c3";
		StringBuilder finalOutput=new StringBuilder("");
		Map<String,Long> intermediateOutput = Arrays.asList(input.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		intermediateOutput.entrySet().forEach(entry->finalOutput.append(entry.getKey()+""+entry.getValue()));
		
		String fromMap =intermediateOutput.entrySet().stream().reduce("",(partialResult,entry)-> partialResult+entry.getKey()+entry.getValue(),(finalResult,partialResult)->finalResult+partialResult);
		
		System.out.println(finalOutput);
		System.out.println(fromMap);
		
	}

}
