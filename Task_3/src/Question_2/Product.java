package Question_2;

public class Product implements Taxable {

    int pid;
    int price;
    int quantity;

    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;

    }

    @Override
    public float calcTax() {
    float totalTax = price * quantity * (salesTax / 100);
    return totalTax;
}

    
}
