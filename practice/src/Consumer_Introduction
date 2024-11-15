package com.java8.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *                          Consumer (I)
 *             -----------------------------------
 *             **)  Present In java.util.function package.
 *             **)  It represents a function which takes in one argument and produces a result.
 *             **)  However these kind of functions don’t return any value.
 *             **)  Hence this functional interface takes in 2 generics namely as follows:
 *                          
 *                           T: denotes the type of the input argument to the operation
							  
		       **)  Method present in Function : accept()
		       **)  The lambda expression assigned to an object of Consumer type
		               is used to define its accept() which eventually applies the given 
		               operation on its argument. 
		               
		        **)  Consumers are useful when it not needed to return any value 
		                as they are expected to operate via side-effects. 
		               
		               
		               
		               Methods in Function Interface
		  -----------------------------------------------------------------------
		  The Function interface consists of the following 2 methods as listed 
		  which are later discussed as follows:

				 1) accept()
				 2) andThen()  -> f1.andThen(f2).apply(data); // first f1 and then f2 will execute
			
 */
public class Introduction {

	public static void main(String[] args) {
	
		Consumer<Integer> display = a -> System.out.println(a);
		 
		// Implement display using accept()
        display.accept(10);
 
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
 
        // Consumer to display a list of numbers
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
 
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
 
        // Implement modify using accept()
        modify.accept(list);
 
        // Implement dispList using accept()
        dispList.accept(list);
    }

}
