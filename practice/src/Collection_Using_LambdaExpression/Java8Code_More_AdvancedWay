package com.java8.Collection_Using_LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 *      Discuss : 
 *      --------------
 *      Operation  : Sorting ( ascending order )
 *      Default Behavior : Insertion order .
 *      Functional Interface : Comparator class
 *      method : compare().
 *      
 *     We will remove an extra MyComparator class as we can directly
 *      write lambda expression for my compare method.
 *   
 */
public class Java8Code_More_AdvancedWay {
	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		System.out.println("Before sorting : " + l);
// We can directly define it in sort method.
		Collections.sort(l, (n1, n2) -> (n1 > n2) ? +1 : (n1 < n2) ? -1 : 0);
		System.out.println("After Sorting : " + l);
	}
}
