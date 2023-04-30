import java.util.ArrayList;

public class Calculator {
    private double totalSum;
    ArrayList<Product> products = new ArrayList<>();


    public void add(Product product) {
        products.add(product);
        totalSum += product.price;
    }

    public void printProducts(int usersNumber) {
        System.out.println("Добавленные товары:");
        for (Product product : products) {
            System.out.printf("%s - %.2f руб.\n", product.name, product.price);
        }
        double pricePerUser = totalSum / usersNumber;
        String formattedRubles = Formatter.getFormattedRubles(pricePerUser);
        System.out.printf("Каждый должен заплатить по %.2f %s", pricePerUser, formattedRubles);
    }
}
