package Exeption;

public class ThrowsPrg extends ThrowsMethods{
	ThrowsPrg m=new ThrowsPrg();
	public static void main(String args[]) {
		
		try {
			MethodA();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
