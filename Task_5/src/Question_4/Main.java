package Question_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        
        //get local date from system
        LocalDate localDate = LocalDate.now();

        //get user input for birthdate
        System.out.println("Enter your birthdate exactly as (yyyy-mm-dd) format:");
        String input = scanner.nextLine();

        //String input = "1990-05-15";
        
        //parse the formatted birthdate and store it as local date 
        LocalDate birthDay = LocalDate.parse(input);

        //use period between method to get the period between birthday and current day
        Period age = Period.between(birthDay, localDate);

        System.out.println("Your age is: " + age.getYears() + " years, " 
        + age.getMonths() + " months, and " 
        + age.getDays() + " days.");

        scanner.close();

    }
}
