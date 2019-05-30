
public class TryWithMultipleCatch  {
	   static void checkEligibilty(int stuage, int stuweight) throws ArithmeticException{ 
	      if(stuage<12 && stuweight<40) {
	         throw new ArithmeticException(); 
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 

	   public static void main(String args[]){ 
	     System.out.println("Welcome to the Registration process!!");
	     try {
	     checkEligibilty(9, 39); 
	     } catch(ArithmeticException e) {
	    	 
	    	 System.out.println(e);
	     }
	     
	     finally {
	     }
	     System.out.println("Have a nice day.."); 
	 } 
	}
