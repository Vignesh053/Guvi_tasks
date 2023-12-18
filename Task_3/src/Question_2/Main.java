package Question_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);


        

        System.out.println("type name of the employer and press enter");
        String name = scanner.nextLine();

        System.out.println("type employeeID of " + name + " and press enter");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("type the salary of " + name);
        int salary = scanner.nextInt();

        Employee employee = new Employee(empId, name, salary);

        
        System.out.println("type product ID and press enter");
        int pId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("type price of product and press enter");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("type the quantity of product and press enter");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Product product = new Product(pId, price, quantity);
            
        float employeeTax = employee.calcTax();
        System.out.println("Total income tax payable for " + employee.name + " with Employee ID " + employee.empId + " is: " + employeeTax);

        float productTax = product.calcTax();
        System.out.println("Total sales tax payable for the product is: " + productTax);

       
        scanner.close();


    }

}
