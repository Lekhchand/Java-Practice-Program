

@FunctionalInterface
interface SayHello{
	 void say(String msg);	
	  default void sayhi(String mcg){
		 
	 }
}

public class FunctionalInterface8 implements SayHello
{
	public void say(String msg) {
		System.out.println("PRINT ANY MSG= " +msg);
		
	}	
	public void sayhi(String mcg) {
		
		System.out.println("msg is  ="+mcg );
	}

	public static void main(String[] args) {
		FunctionalInterface8 ob1= new FunctionalInterface8();
		ob1.say("Hello Java");
		ob1.sayhi(" Java Programing");
		

	}

	
}
