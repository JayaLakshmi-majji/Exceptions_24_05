package Exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedTryCatch {
	public static void main(String args[]) throws  IOException {
		System.out.println("enter j");
		
		try {
			int i=10,j;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			j=Integer.parseInt(br.readLine());
			try {
				try {
					int k=i/j;
					System.out.println(k);
				} catch(ArrayIndexOutOfBoundsException ea) {
					System.out.println("array index is greater than prefered");
				}
			} catch(ArithmeticException ear) {
				System.out.println("denominator cannot be zero");
			}
		} catch(NumberFormatException e) {
			System.out.println("j should be a number");
		}
		System.out.println("end");
	}
}
