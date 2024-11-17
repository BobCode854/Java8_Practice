package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Employee
{
	private Integer id;
	private String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public int hashCode() {
		return 1;
	}
	
	 
	
}
public class Map_With_Same_HashCode
{

	/**
	 *     
	 *    If a map has 5 employee object as a Key and we have implemented equals and hashcode 
	 *     and in the hashcode If we are always returning any constant value .
	 *     then what would be the map size after entring 5 employee object in a map .
	 */
	public static void main(String[] args) {
		Employee employee1 = Employee.builder().id(1).name("Karan").build();
		Employee employee2 = Employee.builder().id(2).name("Bobby").build();
		Employee employee3 = Employee.builder().id(3).name("Shubham").build();
		Employee employee4 = Employee.builder().id(4).name("Nihar").build();
		Employee employee5 = Employee.builder().id(5).name("Anusha").build();
		
		
		Employee employee6 = Employee.builder().id(1).name("Karan").build();
		Employee employee7 = Employee.builder().id(1).name("Karan").build();
		Employee employee8 = Employee.builder().id(1).name("Karan").build();
		Employee employee9 = Employee.builder().id(1).name("Karan").build();
		Employee employee10 = Employee.builder().id(1).name("Karan").build();
	
		Map<Employee , Integer> objectWhenNotDuplicate = new HashMap<>();
		Map<Employee , Integer> objectWhenDuplicate = new HashMap<>();
		
				objectWhenNotDuplicate.put(employee1, 1);
				objectWhenNotDuplicate.put(employee2, 1);
				objectWhenNotDuplicate.put(employee3, 1);
				objectWhenNotDuplicate.put(employee4, 1);
				objectWhenNotDuplicate.put(employee5, 1);
				
				objectWhenDuplicate.put(employee6, 1);
				objectWhenDuplicate.put(employee7, 1);
				objectWhenDuplicate.put(employee8, 1);
				objectWhenDuplicate.put(employee9, 1);
				objectWhenDuplicate.put(employee10, 1);
				
	
				System.out.println("=========== When map object is not duplicate =====================");
						System.out.println("Map Size : "+ objectWhenNotDuplicate.size());
						System.out.println("HashCode for different Object In case of Non Duplicate Data ");
						System.out.println(objectWhenNotDuplicate.get(employee1).hashCode());
						System.out.println(objectWhenNotDuplicate.get(employee2).hashCode());
						System.out.println(objectWhenNotDuplicate.get(employee3).hashCode());
						
			System.out.println("=========== When map object is duplicate =====================");
						System.out.println("Map Size : "+objectWhenDuplicate.size());
						System.out.println("HashCode for different Object In case of  Duplicate Data ");
						System.out.println(objectWhenDuplicate.get(employee7).hashCode());
						System.out.println(objectWhenDuplicate.get(employee8).hashCode());
						System.out.println(objectWhenDuplicate.get(employee9).hashCode());

	}

}
