package com.java8.Default_And_Static_Method;


/**
 *                 Default Concept
 *                 ------------------------
 *                  Problem :  In an existing interface If we will try to add any method , 
 *                                     this is not possible and can cause issue because of its many
 *                                      implementation class .
 *                 
 *                 Solution : we can use default as method in Interface which will not create any
 *                                   problem to the implemented class and later on we can oveeride to 
 *                                   our class as per the need.
 *                                   
 *                                   
 *                                   
 *              Note
 *              -------------
 *              **) Here default is not a modifier.
 *              **) The name default because the default implementation will be provided in interface.
 *              **) The default method when overrided to the class the modifier must be "public".
 *              
 *              **)                           Default method
 *                                        -----------------------------------
 *                                         type                              modifier
 *                                     -------------                     --------------------
 *                                         Interface  :                default
 *                                         Class         :                public
 *              
 *              **) An interface cannot declare any of the methods of the object class
 *                     as a default method. 
 *                     This restriction may be surprising, especially since the interface
 *                      does not inherit from object.
 *                      
 *                      The short answer is this: Java, by design, can be misunderstood 
 *                       from the OOP design perspective:
 *              
 *              
 *              **) Let’s suppose we have an interface, A, 
 *              
 *                    which declares a default method equals with the same signature 
 *                     as the equals method of the object class.
 *                     
 *                      Class B  implements the A interface, which, by design, 
 *                       inherits the object class, and then,
 *                       what version of the equals method does B inherit? 
 *                       A conflict would arise in this case.
 *              
 *                     Another reason is that, in this case, the interface default method 
 *                     becomes useless, 
 *                     because the equals method from the object class will always be
 *                      invoked in children classes. 
 *                      
 *                    This would conflict with the fact that the interface can be evolved. 
 *                    
 */
interface I
{
	public void m1();
	/*
	 *   If we will  add  
	 *     
	 *      public void m2();
	 *      
	 *    here the code will not compile because of the lack of
	 *     implementation of method in implemented class.
	 *     
	 *     
	 *     But at the same place  if we will add,
	 *     
	 *     default void m2(){} . The code will perfectly compile.
	 */

	default void m2(){
		System.out.println("M2 Implementation");
	}
	
}
class T1 implements I
{
	public void m1() {}
}
class T2 implements I
{
	public void m1() {}
}
class T3 implements I
{
	public void m1() {}
}
class T4 implements I
{
	public void m1() {}
}
class T5 implements I
{
	public void m1() {}
}
public class BasicOfDefaultMethod implements I{

	public void m1() {}
	
	public static void main(String[] args) {
		BasicOfDefaultMethod obj = new BasicOfDefaultMethod();
		System.out.println("Hello");
		obj.m2();

	}

}
