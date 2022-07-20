package interfaceexample1;

import java.util.Scanner;

public class HDFC implements RBI{
	float totalAmount;
	public void recurringDeposit(float amount, int duration) {
		float iAmt=(amount*duration*INTEREST)/100;
		totalAmount=iAmt+(amount*duration);
		System.out.println("Your Maturity Amount after "+duration+" months ="+totalAmount);		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("RD Calculator \nEnter Amount you deposit per month");
		float amount=sc.nextInt();
		System.out.println("Enter Months");
		int duration=sc.nextInt();
		HDFC hdfc=new HDFC();
		hdfc.recurringDeposit(amount, duration);
	}
}
