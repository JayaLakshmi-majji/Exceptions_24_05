package Exeption;

import java.util.Scanner;

public class BankDemo {
	public static void main(String args[]) throws Withdraw {
		double amount;
		Scanner sc=new Scanner(System.in);
		amount=sc.nextDouble();
		Withdraw w=new Withdraw();
		w.WithdrawAmount(amount);
		sc.close();
	}
}
