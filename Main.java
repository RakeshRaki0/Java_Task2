import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] product = new Product[5];

        for (int i=0; i< 5; i++){
            System.out.println("Enter the details of the product "+ (i+1));
            System.out.print("Enter Pid: ");
            int pid =scanner.nextInt();
            System.out.print("Enter the price: ");
            double price=scanner.nextDouble();
            System.out.print("Enter the Quantity: ");
            int quantity = scanner.nextInt();

            product[i] = new Product(pid,price,quantity);
        }
        int productIdWithHighestPrice = XYZ.findProductIdWithHighestPrice(product);
        System.out.println("Pid of the product with the highest price: " + productIdWithHighestPrice);

        double totalAmountSpent = XYZ.calculateTotalAmountSpent(product);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }
}
