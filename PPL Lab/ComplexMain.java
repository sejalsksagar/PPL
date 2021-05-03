/**
 03/05/21
 PPL Lab #1: 
	Write a Java Program to perform Arithmetic operations of two complex
	nos. (Addition, Subtraction, Multiplication and Division)
      
 * @author sejal 2372
 */

import java.util.Scanner;

class Complex{
	double real, imag;
	
	Complex(){
		real = 0;
		imag = 0;
	}
	
	public void accept(Scanner sc) {
		System.out.print("\nEnter real part: ");
		real = sc.nextDouble();
		System.out.print("Enter imaginary part: ");
		imag = sc.nextDouble();
	}
	
	public String display() {
		return "("+String.valueOf(real)+") + (" +String.valueOf(imag)+")i";
	}
	
	public void add(Complex A, Complex B) {
		real = A.real + B.real;
		imag = A.imag + B.imag;
	}
	
	public void subtract(Complex A, Complex B) {
		real = A.real - B.real;
		imag = A.imag - B.imag;
	}
	
	public void multiply(Complex A, Complex B){
		real = (A.real*B.real - A.imag*B.imag);
		imag = (A.real*B.imag + A.imag*B.real);
	}
	
	public void divide(Complex A, Complex B) {
		double D = (B.real*B.real + B.imag*B.imag);
		real = (A.real*B.real + A.imag*B.imag)/D;
		imag = (A.imag*B.real - A.real*B.imag)/D;
	}
}

public class ComplexMain {

	public static void main(String[] args) {
		
		int ch;
		Scanner sc = new Scanner(System.in);
		
		Complex A = new Complex();
		Complex B = new Complex();
		Complex R = new Complex();

		A.accept(sc);
		System.out.println("1st Complex Number is: "+A.display());
		
		B.accept(sc);
		System.out.println("2nd Complex Number is: "+B.display());
		
		System.out.println("____________________________________________________");

		do{
			System.out.println("**** OPERATIONS ON COMPLEX NUMBERS ****");
			System.out.println("0. Exit");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			System.out.println("____________________________________________________");
	
			switch(ch){
				case 0: System.out.println("********** PROGRAM ENDED **********");
				break;
		
				case 1: R.add(A, B);
						System.out.println(A.display()+" + "+B.display()+" = "+R.display());
						break;
		
				case 2: R.subtract(A, B);
						System.out.println(A.display()+" - ["+B.display()+"] = "+R.display());
						break;
		
				case 3: R.multiply(A, B);
						System.out.println("["+A.display()+"] x ["+B.display()+"] = "+R.display());
						break;
				
				case 4: R.divide(A, B);
						System.out.println("["+A.display()+"] / ["+B.display()+"] = "+R.display());
						break;
		
				default: System.out.println("Invalid choice");
			}
			System.out.println("____________________________________________________");
		}while(ch!=0);
		
		sc.close();
	}

}
