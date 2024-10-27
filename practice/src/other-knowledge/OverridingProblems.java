package inheritance;



/**
 *   =================== Problem ============================
 *   1) Suppose you have 2 class Parent and Child both have same method show()
 *   
 *    Parent have show(Integer i) 
 *    Child have show(String i)
 *    
 *    we are creating child reference and passing argument null . What will happen . 
 *    
 *    
 *    Solution : 
 *    ================
 *    Scenarios
 *    
 *    Because child class is extending parent class then child class will have 2 show methods If the method will not annotated with
 *    @Ovverride . 
 *    
 *    If @Ovveride then only 1 show method will present with exactly same sign and signature.
 *    If not then 2 show method will be there.
 *    
 *    Below Scenarios are only for when @Override is not present
 *    
 *    Scenario 1
 *    ==========
 *     Parent --->  show(int i)
 *     Child -----> show(Integer i) 
 *     
 *     Conclusion : No issue in this case because in the child class there were
 *                           2 show method with one of primitive and other  of Object type.
 *                           
 *                           Child show method will be called here.
 *                           
 *     Scenario 2
 *    ==========
 *     Parent --->  show(Integer  i)
 *     Child -----> show(String  i) 
 *     
 *     Conclusion :  Issue in this case at the place from where we are calling c.show(null) 
 *                            because in the child class there were 2 show method with both of
 *                           Object type .
 *                           
 *                           
 *   Scenario 3
 *    ==========
 *     Parent --->  show(Integer  i)
 *     Child -----> show(int  i) 
 *     
 *     Conclusion :  No issue in this case because in the child class there were 2 show method 
 *                             with Parent is of Object type and child is of   primitive.
 *                              
 *                              Parent method will be called here.
 *                           
 *                         
 *     Scenario 4
 *    ==========
 *     Parent --->  show(int  i)
 *     Child -----> show(int  i) 
 *     
 *     Conclusion :  Issue in this case at the place from where we are calling c.show(null) 
 *                            because child method does not have a show method to handle null.                      
 *                           
 *   
 *    
 *    
 *    
 */

class Parent
{
	public void show(Integer i) {
		System.out.println(" i from Parent : "+i);
	}
	
}
class Child extends Parent{
	

	public void show(int i) {
		System.out.println("i from child"+i);
	}
	
	
}
public class OverridingProblems {

	public static void main(String[] args) {
		Child c = new Child();
		c.show(null);

	}

}
