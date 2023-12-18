package Question_6;

public class Main {
    public static void main(String[] args){
        
        int a = 5;

        int[][] n = new int[a][a];

        int ltop = 0;
        int rtop = a ;
        int lbot = a ;
        int counter = 0;

        while (counter < a*a) {
            
            for (int i = ltop; i < a; i++) {
                n[ltop][i] = rtop;
                counter++;
            }

            for (int i = ltop; i < a ; i++) {
                n[i][ltop] = lbot;
                counter++;
            }

            ltop++;
            lbot--;
            rtop--;
            


        }

        n[a-1][a-1] = 1;
        System.out.println(counter);

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.print(n[i][j]);
            }
            System.out.println();
        }

        
    }
}
