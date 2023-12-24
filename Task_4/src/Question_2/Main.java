package Question_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please Enter VoterId(number)");
            int voterId = scanner.nextInt();
            scanner.nextLine();
            System.out.println();


            System.out.println("Please enter the name of Voter");
            String name = scanner.nextLine();
            System.out.println();



            System.out.println("Please Enter the age of Voter");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println();


            Voter voter = new Voter(voterId, name, age);



        } catch (InvalidAgeException e) {

            //prints custom exception if age is below 18
            System.out.println(e.getMessage());

        } finally{
            
            scanner.close();
        }
        
    }
}
