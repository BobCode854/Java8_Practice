package java8.string;

public class StringBuilderDemo {

	public static void main(String[] args)
	{
		StringBuilder sc = new StringBuilder();
		String finalString = "1233";
		int stringLength = 4;
		String firstNum = "12";
		for (int i = 0; i < stringLength; i++) {
			String s =firstNum+i;
			System.out.println("s  :"+s);
			sc.append(s);
		}
		System.out.println(sc);

	}

}
