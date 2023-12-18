package Question_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a<b){
            if(a<c){
                System.out.println(a + " is the smallest number!");
            }else{               
                System.out.println(c + " is the smallest number!");
            }
            
        }else{
            if(b<c){
                System.out.println(b + " is the smallest number!" );
            }else{
                System.out.println(c + " is the smallest number!");
            }
        }
        





        obj.close();
    }
}
