import java.util.ArrayList;

public class Calculator {
    private double totalSum;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    public void add(String name, double price) {
        names.add(name);
        prices.add(price);
        totalSum += price;
    }

    public void printProducts(int usersNumber) {
        System.out.println("Добавленные товары:");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s - %.2f руб.\n", names.get(i), prices.get(i));
        }
        double pricePerUser = totalSum / usersNumber;
        String formattedRubles = Formatter.getFormattedRubles(pricePerUser);
        System.out.printf("Каждый должен заплатить по %.2f %s", pricePerUser, formattedRubles);
    }
}
