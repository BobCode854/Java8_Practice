package java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Check_Array_Is_In_DecreasingOrder_OrNot
{

	public static void main(String[] args) 
	{
         int arr []	 = {9,8,7,6,2,1};
         Arrays.stream(arr).filter(w->w%2==0).sum();
        boolean isDescreasing =  IntStream.range(0, arr.length-1).allMatch(i-> arr[i]>arr[i+1]);
          if(isDescreasing)
        	   System.out.println("Array is in Decreasing Order");
          else
        	  System.out.println("Array is not in Decreasing Order");
	}

}
