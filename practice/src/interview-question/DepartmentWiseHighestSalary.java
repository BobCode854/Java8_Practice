package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class EmployeeNew1
{
	private int id;
	private String name;
	private String department;
	private double salary;
}
public class Java8_Department_Wise_Highest_Salary {

	public static void main(String[] args)
	{
		List<EmployeeNew1>list = new ArrayList<>();
		EmployeeNew1 emp1 = new EmployeeNew1(1,"Karan","IT",25000);
		EmployeeNew1 emp2 = new EmployeeNew1(2,"Suraj","IT",50000);
		EmployeeNew1 emp3 = new EmployeeNew1(3,"Mahesh","Devops",27000);
		EmployeeNew1 emp4 = new EmployeeNew1(4,"Aman","Devops",30000);
		EmployeeNew1 emp5 = new EmployeeNew1(5,"Nihar","Manager",55000);
		EmployeeNew1 emp6= new EmployeeNew1(6,"Anusha","Manager",65000);
		EmployeeNew1 emp7= new EmployeeNew1(8,"Veena","Tester",28000);
		EmployeeNew1 emp8= new EmployeeNew1(7,"Kavana","Tester",15000);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);	
		 
		
		Comparator<EmployeeNew1> compareBySalary = Comparator.comparing(EmployeeNew1::getSalary);
		
	//	Map<String, List<EmployeeNew1>> groupingByDepartment = list.stream().collect(Collectors.groupingBy(EmployeeNew1::getDepartment));
		
		
	//	System.out.println("groupingByDepartment : "+groupingByDepartment);
		
		Map<String,Optional<EmployeeNew1>> departMentWiseHighestSalary = list.stream().collect(Collectors.groupingBy(EmployeeNew1::getDepartment,
				Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));
		
		BinaryOperator<EmployeeNew1> data =BinaryOperator.maxBy(compareBySalary);
		System.out.println(departMentWiseHighestSalary);

	}

}
