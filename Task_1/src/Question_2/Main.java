package Question_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        if(n < 0){
            System.out.println("The number given is negative");
        }else if(n>0){
            System.out.println("The number given is positive");
        }else{
            System.out.println("the given number is zero");
        }

        obj.close();

        


    }
    
}
