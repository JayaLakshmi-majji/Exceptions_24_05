package Exeption;

public class ThrowsMethods {
	
		 static void MethodA() {
			MethodB();
		}
		static void MethodB() {
			MethodC();
			}
		static void MethodC()throws ArithmeticException{
			int i=0,j=1;
			int k=j/i;
			k=k/0;
		}
}
