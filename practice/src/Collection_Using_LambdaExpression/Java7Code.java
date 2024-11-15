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
 *      As Comparator is functional Interface we will try to write
 *      Lambda expression for it in next Java class for compare method.
 *      
 *   
 */

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer n1,Integer n2)
	{
		return (n1 > n2) ? +1 : (n1 < n2) ? -1 : 0;
	}

}
public class Java7Code {
	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<>();
		MyComparator mycomp = new MyComparator();
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(5);
		l.add(30);
		l.add(0);
		l.add(15);
		
		System.out.println("Before sorting : "+l);
		Collections.sort(l,mycomp);
		System.out.println("After Sorting : "+l);
	}
}
