package java8;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenoddPrint_Using_CompletableFuture 
{
   private static Object object = new Object();
   private static IntPredicate evenCondition = i->i%2==0;
   private static IntPredicate oddCondition = i->i%2!=0;
	
	private static void printNumber(IntPredicate condition) {
		IntStream.rangeClosed(0, 10).filter(condition).forEach(EvenoddPrint_Using_CompletableFuture::execute);
	}
   
	private static void execute(int number) {
		synchronized (object) {
			try {
				System.out.println(Thread.currentThread().getName() + " : " + number);
				object.notify();
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
   
   public static void main(String[] args) throws InterruptedException 
	{
		CompletableFuture.runAsync(() -> EvenoddPrint_Using_CompletableFuture.printNumber(oddCondition));
		CompletableFuture.runAsync(() -> EvenoddPrint_Using_CompletableFuture.printNumber(evenCondition));
		Thread.sleep(1000);
	}

}
