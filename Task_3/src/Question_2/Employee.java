package Question_2;

public class Employee implements Taxable{
    int empId;
    String name;
    int salary;

    public Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public float calcTax() {
       

       float taxPayable = salary* (incomeTax/100);

       return taxPayable;

    }



}
