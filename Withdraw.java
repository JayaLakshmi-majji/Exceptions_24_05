package Exeption;

@SuppressWarnings("serial")
public class Withdraw extends Exception{
	double balance=200,need=0;
	void WithdrawAmount(double amount)throws Withdraw{
	
		try {
			if(amount>balance) {
				 need=amount-balance;
				throw new Withdraw(); 
			}
			else {
				System.out.println("Success");
			}
		} catch(Withdraw e) {
			System.out.println("u are with shortage of"+need);
		}
	}

}