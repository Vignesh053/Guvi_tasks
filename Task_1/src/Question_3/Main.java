package Question_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String n = obj.next();
        

        for (int i = n.length() -1; i >= 0; i--) {
            System.out.print(n.charAt(i));
        }

        obj.close();
    }
}
