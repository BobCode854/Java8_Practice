package fundamental;

import java.util.HashSet;
import java.util.Set;
class Employee3 {
	private int id;
	private String name;

	public Employee3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
	   return id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee3 employee = (Employee3) obj;
		return this.id == employee.getId() && this.name.equals(employee.getName());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Equals_And_HashCode {

	/**
	 *   ***************************** Equals And HashCode *********************************
	 *    HashCode : 
	 *    
	 *      1) It is used to generate unique or reference number of an object.
	 *      2) Through the unique number we can easily identify the uniqueness of an object .
	 *      
	 *      Equals : 
	 *      
	 *      1) Used to compare object based on the content.
	 *      
	 *   Note :  
	 *   
	 *     If HashCode of 2 Objects will be same then there is no guarentee that they will be equal based on content.
	 *     
	 *     Usually equals and hashCode used to avoid duplicate collection object.
	 */
	
	public static void main(String[] args) {
		
	     Employee3 employee1=new Employee3(101,"Karan");
	     Employee3 employee2 = new Employee3(101,"Bob");
	     
	     System.out.println("Is hashCode() same : "+(employee1.hashCode() == employee2.hashCode()));
	     System.out.println("Is equals() same : "+employee1.equals(employee2));
	     
	     /**
	      *  --) Usually equals and hashCode used to avoid duplicate collection object.
	      *  --) If we will remove equals method above set will not be able to uniquely identify the employee object
	      *       and hence add both the object .
	      *       
	      *  --) But If we define equals method it will uniquely identify it and will not add duplicate object . As per
	      *       Set Internal Implementation.
	      *       
	      *    
	      */
	     
	      Employee3 employee3=new Employee3(101,"Karan");
	      Employee3 employee4 = new Employee3(101,"Karan");
	     
	     Set<Employee3> setObj = new HashSet<>();
	     setObj.add(employee3);
	     setObj.add(employee4);
	     
	     System.out.println(setObj);
	}
	
}