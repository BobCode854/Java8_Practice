package java8.array;

import java.util.Arrays;

public class Number_Multiple 
{
	/**
	 *   =============== Ques ======================
	 *   1 . input will be an array of Elements .
	 *   2. Output will be number * 5 in an array using java8
	 */
	public static void main(String[] args) 
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] outputArray = Arrays.stream(arr).map(element -> element * 5).toArray();
		System.out.println(Arrays.toString(outputArray));
		
		
		Tower B3 Ground 1,2,3 floor Brigade Tech Gardens-SEZ Brigade properties Pvt.LTD Katha No. 119 Survey No. 103, 104, 105, 108/1, 108/2, 109 (P), 112 & 113/1B (P) Brookefields, Kundalahalli Village, Marathalli Post, K.R. Puram Hobli, Bengaluru, Karnataka 560037

	}
}
