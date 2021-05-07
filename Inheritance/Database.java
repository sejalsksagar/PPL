/**
 * 05/05/21
 * PPL Lab #3:
 * Implement the following concepts by constructing suitable classes in Java -
        a. Constructors
        b. Constructor Overloading
        c. Function Overloading
        d. Function Overriding
        e. Inheritance

        Create a class Person –
                Field - Name, Birthdate, Contact no and Mail id
                Methods - Constructor, accept and display
        Class Employee –
                Inherits the Person class
                Fields : Emp ID, grade, basic salary, Gross Salary, HRA (House Rent
                Allowance), TA (Traveling Allowance),
                DA (Dearness Allowance)
                Methods : Constructor, accept, display and gross-salary
        Given:
                Grade   Basic   TA
                A       8000    2000
                B       7000    1500
                C       6000    1000
                D       5000    500
        Calculate Gross Salary :
        Gross Salary = Basic + HRA (20% of Basic) + DA (50% Basic) + TA
        e.g if Basic = 8000
        TA = 2000
        HRA = 20% of 8000 = 1600
        DA = 50 % of 8000 = 4000
        Gross = 8000 + 2000 + 1600 + 4000 = 15600
        Optional : you can implement increment function in which you can change
        grade of an employee and recalculate salary with new grade
      
 * @author sejal 2372
 */
package database;

import employee.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Database{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Employee> E = new ArrayList<Employee>(10);
        Iterator<Employee> iter = null;
        Employee emp = null;
        byte ch; 
      
        do{
            System.out.println("****** DATABASE OPERATIONS *******");
            System.out.println("(0) Exit");
            System.out.println("(1) New Employee");
            System.out.println("(2) Display Last Added Employee");
            System.out.println("(3) Display All Employees");
            System.out.println("(4) Display gross salary of an Employee");
            System.out.println("(5) Remove An Employee");
            System.out.println("(6) Increment Grade Of An Employee");
            
            System.out.print("Enter your choice: ");
            ch = Byte.parseByte(sc.nextLine());
            System.out.println("____________________________________________");

            switch(ch){
                case 0: System.out.println("**** PROGRAM ENDED ****");
                        break;

                case 1: Database.accept(sc, emp, E); //New Employee
                        break;

                case 2: Database.display(emp, E); //Display Last Added Employee
                        break;

                case 3: Database.display(emp, E, iter); //Display All Employees
                        break;
                        
                case 4: Database.display(sc, emp, E, iter); //Display gross salary of an employee
                		break;

                case 5: Database.remove(sc, emp, E, iter); //Remove an employee
                        break;

                case 6: Database.increment(sc, emp, E, iter); //Increment grade of an employee
                        break;

                default: System.out.println("Invalid choice.");
            }
            System.out.println("____________________________________________");

        }while(ch!=0);
        sc.close();
    }
   //.......................................................................................
    
    /**
     * Method Overriding: 
     * - Person class's & Employee class's accept(Scanner sc) method
     * - Person class's & Employee class's display() method
     */
    
   //.......................................................................................
    
    //New Employee
    public static void accept(Scanner sc, Employee emp, ArrayList<Employee> E){
        System.out.print("Enter Name: ");
        String fullName = sc.nextLine();
        emp = new Employee(fullName);
        emp.accept(sc);
        E.add(emp);
    }
    
  //.......................................................................................
    
    /**
     * Method Overloading: Database class's display(Employee emp, ArrayList<Employee> E),
     * display(Employee emp, ArrayList<Employee> E, Iterator<Employee> iter) & 
     * display(Scanner sc, Employee emp, ArrayList<Employee> E, Iterator<Employee> iter)
     * static methods
     */

  //Display Last Added Employee
    public static void display(Employee emp, ArrayList<Employee> E){
        if(E.isEmpty()){
            System.out.println("Database is empty.");
            return;
        }
        emp = E.get(E.size() - 1); //last added employee
        emp.display();
    }

  //Display All Employees
    public static void display(Employee emp, ArrayList<Employee> E, Iterator<Employee> iter){
        if(E.isEmpty()){
            System.out.println("Database is empty.");
            return;
        }
        System.out.println("****** EMPLOYEE DATABASE *******");
        iter  = E.iterator();
        while(iter.hasNext()){
            emp = iter.next();
            emp.display();
            System.out.println("____________________________________________");
        }
    }
    
  //Display gross salary of an employee
    public static void display(Scanner sc, Employee emp, ArrayList<Employee> E, Iterator<Employee> iter) {
    	
    	System.out.print("Enter Employee ID to display gross salary: ");
        byte id = Byte.parseByte(sc.nextLine());

        iter  = E.iterator();
        while(iter.hasNext()){
            emp = iter.next();
            if(emp.empID == id){
                emp.gross_salary();
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }
    
  //.......................................................................................
    
    //Remove an employee
    public static void remove(Scanner sc, Employee emp, ArrayList<Employee> E, Iterator<Employee> iter){

        System.out.print("Enter Employee ID of employee to remove: ");
        byte id = Byte.parseByte(sc.nextLine());

        iter  = E.iterator();
        while(iter.hasNext()){
            emp = iter.next();
            if(emp.empID == id){
                E.remove(emp);
                System.out.println("Removed Employee with ID "+id);
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }
    
  //.......................................................................................
    
  //Increment grade of an employee
    public static void increment(Scanner sc, Employee emp, ArrayList<Employee> E, Iterator<Employee> iter){

        System.out.print("Enter Employee ID to increment grade: ");
        byte id = Byte.parseByte(sc.nextLine());

        iter  = E.iterator();
        while(iter.hasNext()){
            emp = iter.next();
            if(emp.empID == id){
                emp.increment();
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }
  
}
