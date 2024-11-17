package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Employee 
{
    private int empId;
    private String empName;
    private double salary;
    private List<String> skills;
    private String department;
    
    
    public  String getName() {
    	return this.empName;
    }
    
	public static void main(String[] args) 
	{
	
		Employee employee1 = Employee.builder().empId(5).empName("Karan").salary(250000d).skills(Arrays.asList("Java","DS")).department("Developer").build();
		Employee employee2 = Employee.builder().empId(2).empName("Rahul").salary(5000d).skills(Arrays.asList("Java","Microservice")).department("Testing").build();
		Employee employee3 = Employee.builder().empId(4).empName("Shekhar").salary(3000d).skills(Arrays.asList("Microservice","Angular")).department("Developer").build();
		Employee employee4 = Employee.builder().empId(3).empName("Rishi").salary(2200d).skills(Arrays.asList("Java","Kafka")).department("Testing").build();
		Employee employee5 = Employee.builder().empId(1).empName("Amrita").salary(60000d).skills(Arrays.asList("Docker","MicroService")).department("Devops").build();
		
		List<Employee> empList = new ArrayList<>();
		empList.add(employee5);
		empList.add(employee4);
		empList.add(employee3);
		empList.add(employee2);
		empList.add(employee1);
		
		//Sort Employee based on empId
		List<Employee> sortedByEmployeeId = empList.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
		System.out.println(sortedByEmployeeId);
		
		//Sort Employee based on empName
		List<Employee> sortedByEmployeeName = empList.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
		System.out.println(sortedByEmployeeName);
		
		//Get the unique skills 
		List<String> skills = empList.stream().flatMap(employee->employee.getSkills().stream()).distinct().collect(Collectors.toList());
		System.out.println(skills);
		
		// Find out the employee who have Java as a skill
		  List<Employee> employeeHavingJavaSkill = empList.stream().filter(employee->employee.getSkills().contains("Java")).collect(Collectors.toList());
		  System.out.println(employeeHavingJavaSkill);
		  
	   // Find the employee who is having java as a skill and then group by according to descending order of salary
		  
		 List<Employee> employeeWithJavaSkillAndDescendingSalary = empList.stream().filter(employee->employee.getSkills().contains("Java")).sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).collect(Collectors.toList());
		 System.out.println(employeeWithJavaSkillAndDescendingSalary);
		 
		 // Group Employees Based on department
		 Map<String,List<Employee>> mapOfDepartmentToListOfEMployeeInThatDepartment = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		 // Iteration 1st way
		 System.out.println("================= Grouping By Department 1st Way =================================");
		 mapOfDepartmentToListOfEMployeeInThatDepartment.forEach((department,employees)->{
			 System.out.println("----------- "+department+"-------------------------");
			 employees.forEach(System.out::println);
		 });
		 
		 //Iteration 2nd Way
		 System.out.println("================= Grouping By Department 2nd Way =================================");
		 mapOfDepartmentToListOfEMployeeInThatDepartment.entrySet().stream().forEach((department)->{
			 System.out.println("----------- "+department.getKey()+"-------------------------");
			 department.getValue().stream().forEach(System.out::println);
		 });
		  
		 
		 
		 
		 // Method reference
		List<String> ename =  empList.stream().map(Employee::getName).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(ename);
		
		
		// Find employee with highest salary
		Employee employeeWithHighestSalary = 
				empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Employee with highest salary : "+employeeWithHighestSalary);
		
	
	}

}
