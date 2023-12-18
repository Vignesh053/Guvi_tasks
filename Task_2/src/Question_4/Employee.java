package Question_4;

public class Employee extends Person {

    int employeeID;
    int salary;

    public Employee(String name, int age, int employeeID, int salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("age; "+age);
        System.out.println("employee ID: "+employeeID);
        System.out.println("Salary: "+salary);
    }
    
}
