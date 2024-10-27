package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lombok.ToString;

@ToString
class Person {

	private String name;
	private int age;
	private String nationality;

	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public Person(String name, int age) {
		this(name, age, "");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

  public String getNationality() {
    return nationality;
  }
}

public class Java8_Find_Oldest_Person {

	public static Person getOldestPerson(List<Person> people) {
		// Way 1 : Here we have to use "-" sign to compare.
       Person oldestPerson= people.stream().max((person1,person2)->person1.getAge()-person2.getAge()).get();
      System.out.println("oldestPerson  :"+oldestPerson);
       //Way 2 
      Person oldestPerson2= people.stream().max(Comparator.comparing(Person::getAge)).get();
      System.out.println("oldestPerson2  :"+oldestPerson2);
       return oldestPerson;
	}
	
	public static void main(String[] args) {
		  Person sara = new Person("Sara", 4);
		    Person viktor = new Person("Viktor", 40);
		    Person eva = new Person("Eva", 42);
		List<Person> collection = Arrays.asList(sara, eva, viktor);
		System.out.println(getOldestPerson(collection));
}

}
