/**
 * 06/05/21
 * PPL Lab #4: 
	Title: Create User defined exception to check the specific conditions for
		   recruitment system and throw the exception if the criterion does not met in Java.
      
 * @author sejal 2372
 */
package eligibility;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		final int MAX = 50;
		Scanner sc = new Scanner(System.in);

		int N;
		byte maxATKTs;
		double minPer;
		String eligible = null;
		Student[] S = new Student[MAX];

		System.out.print("Enter number of students : ");
		N = sc.nextInt();
		sc.nextLine(); //'\n'

		for (int i = 0; i < N; i++)
		{
			S[i] = new Student();
			System.out.println("\nEnter details for Student "+(i+1)+" : ");
			S[i].accept(sc);
		}

		// accept eligibility conditions
		System.out.print("\nMaximum ATKTs: ");
		maxATKTs = sc.nextByte();
		sc.nextLine(); //'\n'
		System.out.print("Minimum percentage: ");
		minPer = sc.nextDouble();
		sc.nextLine(); //'\n'

		//Displaying students list
		System.out.println("\n------------------------------------------------------------------------------------");
		System.out.format("%5s %5s %15s %6s %20s %20s", "Sr no.", "Roll no.", "Student Name", "ATKTs", "Percentage", "Eligibility");
		System.out.println("\n------------------------------------------------------------------------------------");
		
		for (int i = 0; i < N; i++)
		{
			try
			{
				eligible = S[i].checkEligible(maxATKTs, minPer);
			}
			catch (Eligible e)
			{
				eligible = "Not Eligible";
			}
			finally {
				S[i].display(i, eligible);
				System.out.println("\n....................................................................................\n");
			}
		}
	}
}