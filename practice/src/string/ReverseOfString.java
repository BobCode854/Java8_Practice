package recursion;


public class ReverseOfString 
{
               public static void main(String args[])
               {
            	   String s = "Karan";
            //	  String reverse = getReverse(s);
            	  String reverseUsingCharAT= getReverse(s);
            	  System.out.println(reverseUsingCharAT);
            	  
            	  
            	  
            	 System.out.println("========================================");
            	 
            
               }

//			private static String getReverse(String s) {
//			
//				int length = s.length(); 
//				if(s.length()!=0) {
//					StringBuilder insertedDataInStack = new StringBuilder(s.substring(length-1));
//					String substr = s.substring(0,length-1);
//					return insertedDataInStack + getReverse(substr); 
//				}
//				else
//					 return s;
//			}
               
//               private static String getReverse(String s) {
//            	    if (s.length() == 0) {
//            	        return s;
//            	    }
//            	    return s.substring(s.length() - 1) + getReverse(s.substring(0, s.length() - 1));
//            	}
               
               private static String getReverse(String s) {
            	   int length = s.length();
            	   if(length==0) {
            		   return s;
            	   }
            	  return  s.substring(length-1)+getReverse(s.substring(0,length-1));
               }
               
               private static String getReverse2(String s) {
            	   int length = s.length();
            	   if(length==0) {
            		   return s;
            	   }
            	  return   getReverse2(s.substring(1))+s.charAt(0);
               }
               
	
}
