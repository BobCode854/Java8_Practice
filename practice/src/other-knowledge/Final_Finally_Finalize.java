package fundamental;

public class Final_Finally_Finalize {

	/**
	 * 
	 *   *************** Final , Finally, Finalize ************************
	 *   
	 *      --) Final is a Keyword , 
	 *      --) Finally is a block used for cleanup activity (Stream closing , connection closing)
	 *      --) Finalize is a method which is called by JVM in a periodical manner to cleanup the unused object . 
	 *            Usually when we write System.gc() finalize method will be called itself.
	 *              
	 */
	final int a =10;
	
	public void m1() {
	//	a=20; // cant reassign;
		try {
			System.out.println("try block executed");
		}
		finally {
			System.out.println("finally block executed");
		}
	}
	
	@Override
	 protected void finalize() {
		System.out.println("Finalize get called");
	}
	public static void main(String[] args) 
	{
		Final_Finally_Finalize obj = new Final_Finally_Finalize();
		obj.m1();
		System.gc();
		/**
		 * --) Now this time our finalize will not be called as JVM will identify no object to be null . 
		 * --) In general JVM first identify whether any unused object or not 
		 *  --) Then with System.gc() method it will call finalize method.
		 */

		obj = null;
		System.gc();

		/**
		 * --) This time Finalize will be called by JVM as we have obj as null present.
		 */

	}

}
