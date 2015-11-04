
import java.util.Scanner;

public class NetPay {

	public static void main(String[] args)
	{
		double Federal_Tax_Percent, State_Tax_Percent, SS_Percent, Medicare_Percent, Pay_Per_Hour;	

		Federal_Tax_Percent = 10.00;
		State_Tax_Percent= 4.5;
		SS_Percent= 6.2;
		Medicare_Percent= 1.45;
		Pay_Per_Hour= 7.25;

		int hoursPerWeek= 40;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of hours worked per week:");
		hoursPerWeek = keyboard.nextInt();

		double grossPay, netPay, federalTax, stateTax, medicare, socialSecurity;

		grossPay=hoursPerWeek*Pay_Per_Hour;

		federalTax=(grossPay*Federal_Tax_Percent)/100;

		stateTax=(grossPay*State_Tax_Percent)/100;

		socialSecurity=(grossPay*SS_Percent)/100;

		medicare=(grossPay*Medicare_Percent)/100;

		netPay=grossPay - federalTax - stateTax - socialSecurity - medicare;



		System.out.println("Gross Pay:\t" + grossPay);
		System.out.println("Federal:\t" + federalTax);
		System.out.println("State:\t\t" + stateTax);
		System.out.println("SS:\t\t" + socialSecurity);
		System.out.println("Medicare:\t" + medicare);



	}


}

