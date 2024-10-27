package fundamental;

import java.util.*;
import java.util.stream.Collectors;

 final class Employee {

    private final String name;
    private final Date doj;//mutable
    private final List<String> mobile; //mutable


    public Employee(String name, Date doj, List<String> mobile) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
    // 	return doj; // If we will directly return the object then mutability will be possible.
        return (Date) doj.clone();
    }

    public List<String> getMobile() {
    	//return mobile ; // This will allow mutability
    //	 return Collections.unmodifiableList(mobile); This will not allow mutability but will give exception at Runtime.
        return new ArrayList<>(mobile); // best way to handle.
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                '}';
    }   
}
public class Custom_Immutable_class {

	 public static void main(String[] args) {
	        Employee employee=new Employee("Basant",new Date(),
	                Arrays.stream(new String[]{"1234","5678"}).collect(Collectors.toList()));

	        employee.getDoj().setDate(20);
	        employee.getMobile().add("9010");

	        System.out.println(employee);


	    }
}
