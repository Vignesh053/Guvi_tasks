package Question_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        try {

            
            System.out.println("Please Enter Roll number for the student");
            int rollno = scanner.nextInt();
            scanner.nextLine();
            System.out.println();


            System.out.println("Please enter the name of the student(only use alphabets)");
            String name = scanner.nextLine();
            System.out.println();



            System.out.println("Please Enter the age of Student(only students with age between 15 and 21 are allowed)");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println();



            System.out.println("please enter the course student want to enroll for");
            String course = scanner.nextLine();



            //initialize student object with the user input
            Student student = new Student(rollno, name, age, course);



        } catch (AgeNotWithinRangeException e) {

            //prints the custom exception if age is not within range
            System.out.println(e.getMessage());

        } catch (NameNotValidException e) {

            // prints the custom exception if name contains numbers or special characters
            System.out.println(e.getMessage());
            
        } 

        scanner.close();
    }
}

