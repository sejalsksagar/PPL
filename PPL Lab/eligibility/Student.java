package eligibility;

import java.util.Scanner;


public class Student {
	public static final double MAX_TOTAL = 300;
	public static final double MIN_MARKS = 40;
	
	int roll;
	String name;
	byte ATKTs;
	double sub1, sub2, sub3;
	double percent;
	
	Student(){
		roll = 0;
		name = null;
		ATKTs = 0;
		sub1 = 0;
		sub2 = 0;
		sub3 = 0;
		percent = 0;
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter roll number: ");
		roll = sc.nextInt();
		sc.nextLine(); //'\n'
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter marks for sub1, sub2 & sub3: ");
		sub1 = sc.nextDouble();
		sub2 = sc.nextDouble();
		sub3 = sc.nextDouble();
	}
	
	public void display(int i, String eligible) {
		//Srno. Rollno.  Name   ATKTs   percent  Eligibility
		System.out.format("%5d %5d %15s %6d %20f %20s", i+1, roll, name, ATKTs, percent, eligible);
	}
	
	public void countATKTs() {
		if(sub1 < MIN_MARKS)
			ATKTs++;
		if(sub2 < MIN_MARKS)
			ATKTs++;
		if(sub3 < MIN_MARKS)
			ATKTs++;
	}
	
	public void calculatePercent() {
		double sum = sub1 + sub2 + sub3;
		percent = sum/MAX_TOTAL * 100;
	}
	
	public String checkEligible(byte maxATKTs, double minPer) throws Eligible {
		countATKTs();
		calculatePercent();
		
		if(ATKTs>maxATKTs || percent<minPer)
			throw new Eligible("Not Eligible");
		else
			return "Eligible";
	}
}
