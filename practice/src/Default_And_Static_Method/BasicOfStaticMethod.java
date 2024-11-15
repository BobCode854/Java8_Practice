package com.java8.Default_And_Static_Method;


/**
 *                  Static Method
 *            ---------------------------------------
 *              Unlike other methods in Interface,
 *              these static methods contain the  complete definition of the function
 *              and since the definition is complete and the method is static, 
 *              therefore these methods cannot be overridden or changed in the 
 *              implementation class.
 *              
 */


//Java program to demonstrate
//static method in Interface.

interface NewInterface {

	// static method
	static void hello()
	{
		System.out.println("Hello, New Static Method Here");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

//Implementation Class
public class BasicOfStaticMethod implements NewInterface {

	public static void main(String[] args)
	{
		BasicOfStaticMethod interfaceDemo = new BasicOfStaticMethod();

		/*
		 *     **)  Calling the static method of interface at Line no 42.
		 *     **)  As static method cannot be overriden , 
		 *            there is no other way to call Interface static method
		 */
		
		NewInterface.hello();
		
		

		// Calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
	}

	// Implementing interface method

	@Override
	public void overrideMethod(String str)
	{
		System.out.println(str);
	}
}

