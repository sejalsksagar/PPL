/**
 * 07/05/21
 * PPL Lab #5: 
	Title: Write a Java program to use Java Collection Frameworks like ArrayList and
		   implement its methods. 
		        
 * @author sejal 2372
 */
package diffArrLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Student{
	String name;
	byte roll;
	
	Student(){
		name = "";
		roll = 0;
	}
	
	void accept(Scanner sc) {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter roll no.: ");
		roll = sc.nextByte();
	}
	
	void display() {
		System.out.print("\nName: "+name);
		System.out.print("\nRoll no.: "+roll);
	}
}

public class Almain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ch;
		
		do {
			System.out.println("**** ARRAYLIST ****");
			System.out.println("0. Exit");
			System.out.println("1. Integer");
			System.out.println("2. String");
			System.out.println("3. Student");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			System.out.println("__________________________________");
			
			switch(ch) {
			case 0: System.out.println("********** PROGRAM ENDED **********");
					break;
					
			case 1: integerAL();
					break;
					
			case 2: stringAL();
					break;
					
			case 3: studentAL();
					break;
					
			default: System.out.println("Invalid choice");
			}
		}while(ch!=0);
		
		
	}
		
		public static void integerAL() {
			int ch, d;
			ArrayList<Integer> ial = new ArrayList<Integer>();
			do {
				System.out.println("**** INTEGER ARRAYLIST ****");
				System.out.println("0. Exit");
				System.out.println("1. Add element");
				System.out.println("2. Remove element");
				System.out.println("3. Display the ArrayList");
				System.out.print("Enter your choice: ");
				ch = sc.nextInt();
				System.out.println("__________________________________");
				
				switch(ch) {
				case 0: System.out.println("__________________________________");
						break;
						
				case 1: System.out.print("Enter element to be added: ");
						d = sc.nextInt(); 
						ial.add(d);
						break;
						
				case 2: System.out.print("Enter element to be removed: ");
						d = sc.nextInt(); 
						ial.remove((Integer)d);
						break;
						
				case 3: System.out.println("Integer ArrayList: "+ial);
						break;
						
				default: System.out.println("Invalid choice");
				}
				
			}while(ch!=0);
		}
		
		public static void stringAL() {
			int ch;
			String s;
			ArrayList<String> sal = new ArrayList<String>();
			do {
				System.out.println("**** STRING ARRAYLIST ****");
				System.out.println("0. Exit");
				System.out.println("1. Add element");
				System.out.println("2. Remove element");
				System.out.println("3. Display the ArrayList");
				System.out.print("Enter your choice: ");
				ch = sc.nextInt();
				sc.nextLine(); //'\n'
				System.out.println("__________________________________");
				
				switch(ch) {
				case 0: System.out.println("__________________________________");
						break;
						
				case 1: System.out.print("Enter element to be added: ");
						s = sc.nextLine(); 
						sal.add(s);
						break;
						
				case 2: System.out.print("Enter element to be removed: ");
						s = sc.nextLine(); 
						sal.remove(s);
						break;
						
				case 3: System.out.println("String ArrayList: "+sal);
						break;
						
				default: System.out.println("Invalid choice");
				}
				
			}while(ch!=0);
		}
		
		public static void studentAL() {
			int ch;
			Student S;
			ArrayList<Student> Sal = new ArrayList<Student>();
			Iterator<Student> iter = null;
			do {
				System.out.println("\n**** STUDENT ARRAYLIST ****");
				System.out.println("0. Exit");
				System.out.println("1. Add element");
				System.out.println("2. Remove element");
				System.out.println("3. Display the ArrayList");
				System.out.print("Enter your choice: ");
				ch = sc.nextInt();
				sc.nextLine(); //'\n'
				System.out.println("__________________________________");
				
				switch(ch) {
				case 0: System.out.println("__________________________________");
						break;
						
				case 1: S = new Student();
						S.accept(sc);
						Sal.add(S);
						break;
						
				case 2: System.out.print("Enter roll no. of student to remove: ");
		        		byte rn = Byte.parseByte(sc.nextLine());
		        		iter = Sal.iterator();
				        while(iter.hasNext()){
				            S = iter.next();
				            if(S.roll == rn){
				                Sal.remove(S);
				                System.out.println("Removed Student with roll "+rn);
				                break;
				            }
				        }
						break;
						
				case 3: System.out.println("Student ArrayList: ");
						iter = Sal.iterator();
						while(iter.hasNext()){
				            S = iter.next();
				            S.display();
				        }
						break;
						
				default: System.out.println("Invalid choice");
				}
				
			}while(ch!=0);
		}
}
