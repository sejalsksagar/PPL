package employee;

import java.util.Scanner;

import person.*;

/**
 * Single Inheritance
 * Parent class : Person
 * Child class : Employee
 */

public class Employee extends Person { 
    static byte ID_counter = 0;
    public byte empID;
    char grade;
    double BS; //Basic Salary
    double GS; //Gross Salary
    double HRA; //House Rent Allowance
    double TA; //Traveling Allowance
    double DA; //Dearness Allowance
    
	/**
	 * Constructor overloading: Employee() & Employee(String fullname)
	 */
    public Employee(){
        super();
        
        //Keeps track of no. of created employees to assign unique empID to each
        ID_counter++; 
        empID = ID_counter;
        
        grade = '\u0000';
        BS = 0.0;
        GS = 0.0;
        HRA = 0.0;
        TA = 0.0;
        DA = 0.0;
    }

    public Employee(String fullname){
        super(fullname);
        ID_counter++; 
        empID = ID_counter;
    }
    
  //.......................................................................................
    /**
     * Method Overloading: Employee class's accept(Scanner sc), accept(Scanner sc, boolean flag) & accept()
     */
    public void accept(Scanner sc){
        //Accepts Person details using accept(Scanner sc) method of Person super class
        super.accept(sc);

        //Accepts grade & set BS & TS
        this.accept(sc, true);
        
        //Calculates & stores HRA, DA & GS
        this.accept();

        System.out.println("New Employee added. Your Employee ID: "+this.empID);
    }
    
    //Accepts grade & set BS & TS
    public void accept(Scanner sc, boolean flag){ 

        while(flag == true){

            System.out.print("Enter Grade: ");
            grade = sc.next().charAt(0);
            sc.nextLine(); //'\n'
            flag = false;

            switch(grade){
                case 'A':   BS = 8000;
                            TA = 2000;
                            break;
                case 'B':   BS = 7000;
                            TA = 1500;
                            break;
                case 'C':   BS = 6000; 
                            TA = 1000;
                            break;
                case 'D':   BS = 5000; 
                            TA = 500;
                            break;
                default: System.out.println("Invalid Grade. Try Again.");
                         flag = true;                           
            }
        }
    }

    //Calculates & stores HRA, DA & GS
    public void accept(){ 
        HRA = 0.20 * BS;
        DA = 0.50 * BS;
        GS = BS + HRA + DA + TA; 
    }
    
  //.......................................................................................
    
    //Displays all details of an employee 
    public void display(){ 
    	
        //displays Person details using display() method of Person class
    	super.display();
        
        System.out.println("------------------");
        
        System.out.println("Employee ID: "+empID);
        System.out.println("Grade: "+grade);
        System.out.println("Basic Salary: "+BS);
        System.out.println("Gross Salary: "+GS);
        System.out.println("House Rent Allowance: "+HRA);
        System.out.println("Travelling Allowance: "+TA);
        System.out.println("Dearness Allowance: "+DA);
    }
    
    //Displays name & gross salary
    public void gross_salary() { 
    	System.out.println("Name: "+super.fullName);
    	System.out.println("Gross Salary: "+GS);
    }
    
  //.......................................................................................

    //Increments grade of an Employee and displays updated details
    public void increment(){
        int ascii_grade = grade; //implicit conv char => int

        if(grade != 'A'){
            ascii_grade--;
            grade = (char) ascii_grade;
            System.out.println("Grade incremented to "+grade);

            switch(grade){
                case 'A':   BS = 8000;
                            TA = 2000;
                            break;
                case 'B':   BS = 7000;
                            TA = 1500;
                            break;
                case 'C':   BS = 6000; 
                            TA = 1000;
                            break;
                default: System.out.println("Invalid Case.");                         
            }
            this.accept();
            System.out.println("**** UPDATED INFO ****");
            this.display();
        }else{
            System.out.println("Grade can't be incremented above A.");
        }
    }
}
