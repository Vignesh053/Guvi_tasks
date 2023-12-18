package Question_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int discountPrice = 0;

        if(a<500){
            System.out.println("No discount applied!");
            System.out.println("Total payable amount: " + a);
        }else if(a>=500 && a<1000){
            discountPrice = a - (a*10/100);
            System.out.println("Total payable amount: " + discountPrice);
        }else if(a>=1000){
            discountPrice = a-(a*20/100);
            System.out.println("Total payable amount: " + discountPrice);
        }

        obj.close();
    }
}
