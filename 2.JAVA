import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    float price;

    void get() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the pcode:");
        pcode = scan.nextInt();
        System.out.println("Enter the pname:");
        pname = scan.next(); // Changed to scan.next() to read a single word
        System.out.println("Enter the price:");
        price = scan.nextFloat();
    }

    void display() {
        System.out.println("pcode:" + pcode);
        System.out.println("pname:" + pname);
        System.out.println("price:" + price);
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        p1.get();
        p2.get();
        p3.get();

        p1.display();
        p2.display();
        p3.display();

        System.out.print("Product with lowest price: ");
        if (p1.price <= p2.price && p1.price <= p3.price)
            System.out.print(p1.pname);
        else if (p2.price <= p1.price && p2.price <= p3.price)
            System.out.print(p2.pname);
        else
            System.out.print(p3.pname);
    }
}
