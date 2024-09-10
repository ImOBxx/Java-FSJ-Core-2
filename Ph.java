
class Member {
    String name;
    int age;
    String no;
    String address;
    int salary;

    // Method to print the salary
    void sal() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Method to print the details of the employee
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + no);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        sal();
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    // Method to print the details of the manager
    public void printDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + no);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        sal();
        System.out.println();
    }
}

public class Ph {
    public static void main(String[] args) {
        // Creating an Employee object and assigning values
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 28;
        emp.no = "123-456-7890";
        emp.address = "123 Elm Street";
        emp.salary = 50000;
        emp.specialization = "Software Development";

        // Creating a Manager object and assigning values
        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 35;
        mgr.no = "987-654-3210";
        mgr.address = "456 Oak Avenue";
        mgr.salary = 75000;
        mgr.department = "IT Department";

        // Printing the details of the Employee and Manager
        emp.printDetails();
        mgr.printDetails();
    }
}
