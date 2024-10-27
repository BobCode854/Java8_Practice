package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Employee2{
	private int id;
	private String name;
	private List<Address> address;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
 class Address{
	
	String street;
	 String  zipCode;
	 List<String> phoneNumbers;
 }

	public class Java8_Map_vs_FlatMap {
		public static void main(String[] args) {
			Employee2 emp = new Employee2();
			emp.setId(1);
			emp.setName("Karan");
			List<String> phoneNumber = Arrays.asList("9534073921", "7979732450");
			Address address1 = new Address("Verma Chowk", "822101", phoneNumber);
			Address address2 = new Address("Marathalli", "560037", phoneNumber);
			List<Address> listOfAddress = new ArrayList<>();
			listOfAddress.add(address1);
			listOfAddress.add(address2);
			emp.setAddress(listOfAddress);
			List<Employee2> listOfEmployee = new ArrayList<>();
			listOfEmployee.add(emp);

		List<Address> addressData =	listOfEmployee.stream().flatMap(emp1->emp1.getAddress().stream()).collect(Collectors.toList());
		System.out.println(addressData);
			
		}

	}
