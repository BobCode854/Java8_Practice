


public class Find_Next_Pallindrome 
{
		public static void main(String[] args) 
		{
			
			int number = Find_Next_Pallindrome.nextPallindrome(2345);
	        System.out.println(number);
	    }

		private static int nextPallindrome(int number) {
			int nextPallindrome;
			String numberInString = String.valueOf(number);
			// divide the number in 2 parts
			int length = String.valueOf(number).length() / 2;
			String firstHalfInString = numberInString.substring(0, length);
			int reverseFirstHalf = Integer.valueOf(new StringBuilder(firstHalfInString).reverse().toString());
			int firstHalf = Integer.valueOf(numberInString.substring(0, length));
			int secondHalf = Integer.valueOf(numberInString.substring(length, numberInString.length()));
			if (reverseFirstHalf > secondHalf) {
				nextPallindrome = Integer.valueOf(String.valueOf(firstHalf).concat(String.valueOf(reverseFirstHalf)));
			} else {
				nextPallindrome = Integer.valueOf(String.valueOf(firstHalf + 1).concat(String.valueOf(reverseFirstHalf)));
			}
			return nextPallindrome;
		}

}
