package fundamental;

public class Infomation 
{

/**
 *    ******************Some Information *******************************
 *        
 *     1) How to write your own immutable class.
 *        
 *         -) Make your class final
 *         -) Declare all instance variable with private and final
 *         -) say no to setter method.
 *         -) Initialize all variables in constructor.
 *         -) Perform cloning of mutable objects while returning from getter method.
 *         
 *     2) Which one is good to store password in java String or char [] and why ?
 *     
 *           Char array is better than String for some reasons :
 *           
 *           --) Since Strings are immutable in Java if you store the password as plain text 
 *                it will be available in memory until the Garbage collector clears it and also 
 *                String literal is stored String pool for reusability there is a pretty high chance
 *                that it will remain in memory for long duration.
 *                
 *          --)  Because its difficult to destroy literal from SCP as GC unable to perform cleanup 
 *                activity in SCP only it will destroy once jvm restarted so which may leads a high 
 *                security threat.
 *                
 *         --)  Since anyone who has access to memory dump can find the password in clear text
 *              and that's another reason you should always use an encrypted password than plain text
         
            --)  Since Strings are immutable there are no way contents of Strings can be changed
                 because any change will produce new String, while if you char[] you can still set all
                 his elements as blank or zero. So Storing the password in character array clearly 
                 mitigates security risk of stealing passwords

             --) With String there is always a risk of printing plain text in log file or console but
                  if use Array you won't print contents of array instead its memory location get printed. 
                  though not a real reason but still make sense.
                  
                  
                  
         3) Difference B/W ArrayList and LinkedList
          
               --)  ArrayList uses dynamic array to store the data . 
               --)  Storing is tough as it will do shifting of element once the size will be full.
               --) It is good If your primary focus is on fetching the data.
               
               
               --) LinkedList : Internal Data Structure is Doubly LinkedList.
               --)  Manipulation is faster than arrayList because of doubly linked list architecture , so no bit shifting is requried.
               --) Better for manipulating data.
        
         4) Is Set always follow rule of allowing non duplicate Element .
         
                No. 
               
                --)   If you are using primitive data then it is following the rule always because 
                       It internally use equals and hashCode.
                       
                --)   But If we are using Non-Primitive then we have to externally put equals and hashCode 
                       to put non-duplicate element.
                       
         5) Difference between comparable and comparator .
               
               Comparable : 
               
                --) Comparable provides a single sorting sequence.
                     In other words, we can sort the collection on the basis of a single element such as id, name, and price.
                     
               --) Comparable affects the original class, i.e., the actual class is modified.
               --) Comparable provides compareTo() method to sort elements.
               --) Comparable is present in java.lang package.
               --) We can sort the list elements of Comparable type by Collections.sort(List) method.
               
               Comparator : 
               
               --) The Comparator provides multiple sorting sequences. 
                   In other words, we can sort the collection on the basis of multiple elements such as id, name, and price etc.
                   
              --) Comparator doesn't affect the original class, i.e., the actual class is not modified.
              --) Comparator provides compare() method to sort elements.
              --) A Comparator is present in the java.util package.
              --) We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
              
              Overall Comparator is more powerful than comparable.
         
              
           6) What is the difference between fail fast and fail Safe iterator. 
                 
                  --) An Iterator which do not allow us modification while Iterating a collection  is called Fail Fast iterator.
                        (ArrayList,HashMap,Vector)
                        
                ( Reason is internally while iterating Iterator use modCount which is fixed and  any changes on this from Collection while cause ConcurrentModificationException)
                        
                 --) Iterator who allow us to modify in the middle while iterating a collection is called Fail Safe Iterator.
                        (CopyOnWriteArrayList,CopyOnWriteArraySet,ConcurrentHashMap)
                        
           ( Reason is internally while iterating Iterator use modCount and while performing any manipulation It will create clone copy of modCount )
           
           ( Now In case of List and Set the newly added element to list will not print in the main List Object . 
             Mean Error will not be there but Iterator will not read the  added data. 
             But In case of Map It will read the data and it will add into the map object by the iterator)
                            

 */
	
}
