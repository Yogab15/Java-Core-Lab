//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
public class Empobj { 
    // Declare private instance variables for employee name, job title, and salary
    private String name;
    private String jobTitle;
    private double salary;
    
    // Constructor to initialize name, job title, and salary
    public Empobj(String name, String jobTitle, double salary) {
        this.name = name;  // Assigns the value of 'name' parameter to the instance variable 'name'
        this.jobTitle = jobTitle;  // Assigns the value of 'jobTitle' parameter to the instance variable 'jobTitle'
        this.salary = salary;  // Assigns the value of 'salary' parameter to the instance variable 'salary'
    }
    
    // Getter method for name
    public String getName() {
        return name;  // Returns the value of the 'name' instance variable
    }
    
    // Getter method for job title
    public String getJobTitle() {
        return jobTitle;  // Returns the value of the 'jobTitle' instance variable
    }
    
    // Getter method for salary
    public double getSalary() {
        return salary;  // Returns the value of the 'salary' instance variable
    }
    
    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;  // Returns the annual salary (salary multiplied by 12)
    }
    
    // Method to update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;  // Updates the 'salary' instance variable with the new salary
        System.out.println("Salary updated for " + name + " (" + jobTitle + ") to $" + salary);  // Prints a message confirming the salary update
    }
    
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Creating an employee object  
        Empobj employee = new Empobj("Yogada Bhalerao", "Software Engineer", 80000.0);
        
        // Displaying employee information
        System.out.println("Employee Name: " + employee.getName());  // Prints the employee name
        System.out.println("Job Title: " + employee.getJobTitle());  // Prints the employee's job title
        System.out.println("Salary: $" + employee.getSalary());  // Prints the employee's salary
        
        // Calculating and displaying the employee's annual salary
        System.out.println("Annual Salary: $" + employee.calculateAnnualSalary());  // Prints the employee's annual salary
        
        // Updating employee salary to $85000.0
        employee.updateSalary(85000.0);  // Calls the updateSalary method to update the employee's salary
    }
}

Dry Run:
Class Declaration:

Declare a class named Empobj.
Private Instance Variables:

Declare private instance variables name, jobTitle, and salary to store employee details.
Constructor:

Define a constructor that takes name, jobTitle, and salary parameters and initializes the corresponding instance variables.
Getter Methods:

Define getter methods getName(), getJobTitle(), and getSalary() to retrieve the values of the instance variables.
Method to Calculate Annual Salary:

Define a method calculateAnnualSalary() that calculates and returns the annual salary based on the monthly salary (salary * 12).
Method to Update Salary:

Define a method updateSalary(double newSalary) that updates the employee's salary with the provided new salary and prints a message confirming the update.
Main Method:

Create an Empobj object named employee with name "Yogada Bhalerao", job title "Software Engineer", and salary $80000.0.
Display the employee's information:
Print the employee's name.
Print the employee's job title.
Print the employee's salary.
Calculate and display the employee's annual salary.
Update the employee's salary to $85000.0 using the updateSalary() method.
Print a message confirming the salary update.

Output: 
Employee Name: Yogada Bhalerao
Job Title: Software Engineer
Salary: $80000.0
Annual Salary: $960000.0
Salary updated for Yogada Bhalerao (Software Engineer) to $85000.0
The program successfully creates an employee object, displays the employee's information, calculates the annual salary,
updates the salary, and confirms the update.
