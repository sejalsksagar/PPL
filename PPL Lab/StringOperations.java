/**
 * 04/05/21
 * PPL Lab #2:
 * 		Do following string operations in Java using String Class and String Buffer Class. Create a menu
		driven program. For the last four operations, you need StringBuffer Class.
				1) Accept a String from user
				2) Display a String
				3) Find Length of the String
				4) Compare two Strings
				5) Find Character at particular position (charAt)
				6) Find substring for the string
				7) Convert Lower case to Upper case
				8) Convert Upper case to Lower case
				9) Reverse the string
				10) Check whether the string is palindrome or not
				11) Append new string to the original string
				12) Replace characters in the string
 * 
 *  @author sejal 2372
 */
package stringOps;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2;
		StringBuffer sb;
		
		System.out.print("Enter a string: ");
		s1 = sc.nextLine();
		
		int ch;
		do {
			System.out.println("********** STRING OPERATIONS **********");
			System.out.println("0. Exit");
			System.out.println("1. Accept a new String from user");
			System.out.println("2. Display the String");
			System.out.println("3. Find Length of the String");
			System.out.println("4. Compare two Strings");
			System.out.println("5. Find Character at particular position");
			System.out.println("6. Find substring for the string");
			System.out.println("7. Convert Lower case to Upper case");
			System.out.println("8. Convert Upper case to Lower case");
			System.out.println("9. Reverse the string");
			System.out.println("10. Check whether the string is palindrome or not");
			System.out.println("11. Append new string to the original string");
			System.out.println("12. Replace characters in the string");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			sc.nextLine(); // '\n'
			System.out.println("________________________________________________");
			
			switch(ch){
			case 0: System.out.println("************ PROGRAM ENDED ************");
					break;
					
			case 1: System.out.print("Enter a string: ");
					s1 = sc.nextLine();
					break;
					
			case 2: System.out.println("The string is: "+s1);
					break;
					
			case 3: System.out.println("Length of string: "+s1.length());
					break;
					
			case 4: System.out.print("Enter another string: ");
					s2 = sc.nextLine();
					System.out.println(s1+" & "+s2+" are: ");
					if(s1.compareToIgnoreCase(s2)==0)
						System.out.println("-> equal (ignoring case)");
					else
						System.out.println("-> NOT equal (ignoring case)");
					if(s1.compareTo(s2)==0)
						System.out.println("-> equal (considering case)");
					else
						System.out.println("-> NOT equal (considering case)");
					break;
					
			case 5: System.out.print("Enter position to find character at: ");
					int pos = sc.nextInt();
					if(pos<0 || pos>s1.length())
						System.out.println("Invalid position for string: "+s1);
					else {
						System.out.println("In the string: "+s1);
						System.out.println("Character at index "+pos+" is "+s1.charAt(pos));
					}
					break;
					
			case 6: System.out.print("Enter start (inclusive) & end (exclusive) index for substring: ");
					int si = sc.nextInt();
					int ei = sc.nextInt();
					if(si<0 || si>=s1.length() || ei<si)
						System.out.println("Invalid start/end index");
					else
						System.out.println("Substring is: "+s1.substring(si, ei));
					break;
					
			case 7: System.out.println("Lower case to Upper case: "+s1.toUpperCase());
					break;
					
			case 8: System.out.println("Upper case to Lower case: "+s1.toLowerCase());
					break;
					
			case 9: sb = new StringBuffer(s1);
					sb.reverse();
					System.out.println("Reverse of "+s1+" is "+sb);
					break;
					
			case 10: sb = new StringBuffer(s1);
					 sb.reverse();
					 if(s1.compareToIgnoreCase(sb.toString())==0)
						System.out.println(s1+" is palindrome");
					else
						System.out.println(s1+" is NOT palindrome");
					break;
					
			case 11: System.out.print("Enter string to append: ");
					 s2 = sc.nextLine();
					 sb = new StringBuffer(s1);
					 sb.append(s2);
					 System.out.println("String after appending: "+sb);
					 break;
					 
			case 12: System.out.print("Enter start (inclusive) & end (exclusive) index: ");
					 si = sc.nextInt();
					 ei = sc.nextInt();
					 System.out.print("string of characters to replace: ");
					 s2 = sc.next();
					 sb = new StringBuffer(s1);
					 sb.replace(si, ei, s2);
					 System.out.println("String after replacing characters: "+sb);
					 break;
					 
			default: System.out.println("Invalid choice.");
			}
			System.out.println("________________________________________________");
		}while(ch!=0);
		sc.close();
	}
}
