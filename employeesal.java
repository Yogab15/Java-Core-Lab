//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer.
//In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
package exercise;

// Base class Employee
class Employee {
    // Method to calculate salary for an employee, default implementation returns 0.0
    public double calculateSalary() {
        return 0.0;
    }
}

// Derived class Manager inheriting from Employee
class Manager extends Employee {
    // Overridden method to calculate salary for a manager
    public double calculateSalary() {
        return 70000.0;
    }
}

// Derived class Programmer inheriting from Employee
class Programmer extends Employee {
    // Overridden method to calculate salary for a programmer
    public double calculateSalary() {
        return 50000.0;
    }
}

// Main class to test the implementation
public class empsalary {
    public static void main(String[] args) {
        // Creating an instance of Manager
        Manager manager = new Manager();
        // Creating an instance of Programmer
        Programmer programmer = new Programmer();
        
        // Displaying the salary of the manager
        System.out.println("Manager's salary: " + manager.calculateSalary());
        // Displaying the salary of the programmer
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }
}

Dry Run:
Manager's salary: 70000.0
Programmer's salary: 50000.0
