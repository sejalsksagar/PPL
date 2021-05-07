package person;

import java.util.Scanner;

public class Person {
    protected String fullName;
    String birthDate;
    String contactNumber;
    String mailID;
    
    /**
	 * Constructor overloading: Person() & Person(String fullName)
	 */

    public Person(){
        fullName = null;
        birthDate = null;
        contactNumber = null;
        mailID = null;
    }

    public Person(String fullName){
        this.fullName = fullName;
    }

    public void accept(Scanner sc){ 
        System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
        birthDate = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        contactNumber = sc.nextLine();
        System.out.print("Enter mail ID: ");
        mailID = sc.nextLine();
    }

    public void display(){
        System.out.println("Name: "+fullName);
        System.out.println("Date of Birth (dd/mm/yyyy): "+birthDate);
        System.out.println("Contact Number: "+contactNumber);
        System.out.println("Mail ID: "+mailID);
    }    
}
