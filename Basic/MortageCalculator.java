/******************************************************************************
MORTAGE CALCULATOR

*******************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;
public class MortageCalculator
{
	public static void main(String[] args) {
	    final byte MONTHS_IN_YEAR = 12;
	    final byte PERCENT = 100;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Principal: ");
	    int principal = sc.nextInt();
	    
	    System.out.print("Annual Interest Rate: ");
	    float annualInterest = sc.nextFloat();
	    float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
	    
		System.out.print("Period (Years): ");
		byte period = sc.nextByte();
		int numPayments = period * MONTHS_IN_YEAR; //implicit conversion byte => int
		
		// calculating mortage using formula // implicit coversions
		double mortage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments))/(Math.pow(1 + monthlyInterest, numPayments) - 1);
		
		NumberFormat mortageAsCurrency = NumberFormat.getCurrencyInstance(); //abstract class
		System.out.println("Mortage: "+mortageAsCurrency.format(mortage));

		sc.close();
	}
}
