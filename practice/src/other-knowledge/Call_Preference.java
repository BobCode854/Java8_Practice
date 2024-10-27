package fundamental;


/**
 *                                      Conclusion on Parent and Child
 *                           ====================================
 */
class Parent {

Parent(){
	
}
}

public class Call_Preference extends Parent {

	
//	Call_Preference (){
//     this("Constructor");
//     System.out.println("Child Class Default Constructor"); //2
// }
//
	Call_Preference (String s){
     System.out.println("Child Class Param Constructor "+s); //1
 }

 public static void main(String[] args) {
	 Call_Preference obj = new Call_Preference("karan");
 }

}

