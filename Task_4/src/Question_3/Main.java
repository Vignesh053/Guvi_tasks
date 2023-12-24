package Question_3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        String[] weekdays = new String[7];
        
        weekdays[0] = "Sunday";
        weekdays[1] = "Monday";
        weekdays[2] = "Tuesday";
        weekdays[3] = "Wednesday";
        weekdays[4] = "Thursday";
        weekdays[5] = "Friday";
        weekdays[6] = "Saturday";

        Scanner scanner = new Scanner(System.in);

            

        try {
            System.out.println("Please enter the number for the day of the week(0 for sunday, 1 for monday and so on)");

            int index = scanner.nextInt();
            
            System.out.println(weekdays[index]);

        } catch(InputMismatchException e){
            
            System.out.println("Invalid input. Please enter a number.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("You have entered the number outside of valid range(0 - 6), please try again");
            
        } finally{
            scanner.close();
        }
    }
}
