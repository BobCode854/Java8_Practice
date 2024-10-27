import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class vehicle
{
	 protected static String getVehicle() {
		 return "vehicle";
	 }
}
class car extends vehicle{
	 public static String getVehicle() {
		 return "car";
	 }
}
public class Question2 {

	public static void main(String[] args) {
	  vehicle v = new car();
	 System.out.println(v.getVehicle());   // This will call vehicle class reference as method is static and we are calling from vehicle reference.
	 
	
	 // Reverse a sentence in a string
	 
		String s = "Karan Is Name My";
		List<String> data = Arrays.asList(s.split(" "));
		Collections.reverse(data);
		String finalData = data.stream().collect(Collectors.joining(" "));
		System.out.println(finalData);

	}

}
