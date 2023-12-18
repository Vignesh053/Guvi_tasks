package Question_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            
            int pID = scanner.nextInt();
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();

            products[i] = new Product(pID, price, quantity);
        }
        scanner.close();
        

        // Product product_1 = new Product(1, 100, 4);
        // Product product_2 = new Product(2, 400, 7);
        // Product product_3 = new Product(3, 300, 5);
        // Product product_4 = new Product(4, 600, 3);
        // Product product_5 = new Product(5, 1200, 2);

        // products[0] = product_1;
        // products[1] = product_2;
        // products[2] = product_3;
        // products[3] = product_4;
        // products[4] = product_5;

        int maxPrice = 0;
        int maxPricePID = 0;

        for (int i = 0; i < products.length; i++) {
            
            if (maxPrice < products[i].price) {
                maxPrice = products[i].price;
                maxPricePID = products[i].pID; 
            }

        }

        System.out.println("Product ID of the product having highest amount is " + maxPricePID);
        System.out.print("total amount spent is ");
        System.out.print(calculateTotalPrice(products));

    }


    public static int calculateTotalPrice(Product products[]){
        int totalAmount=0;

        for (int i = 0; i < products.length; i++) {
            totalAmount += products[i].price * products[i].quantity;
        }

        return totalAmount;
    }

    
}
