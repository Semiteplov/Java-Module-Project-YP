import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int usersNumber = UserInput.readUsersNumber();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Calculator calculator = new Calculator();
        String input = "";
        while(!input.equalsIgnoreCase("завершить")) {
            System.out.print("Введите название товара или команду \"Завершить\": ");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("завершить")) {
                System.out.print("Введите стоимость товара в формате рубли.копейки (например, 10.45): ");
                while(!scanner.hasNextDouble()) {
                    System.out.println("Введите корректную стоимость товара (например, 10.45): ");
                    scanner.next();
                }
                double price = scanner.nextDouble();
                while (price < 0) {
                    System.out.print("Введите положительное число: ");
                    price = scanner.nextDouble();
                }
                scanner.nextLine();
                Product product = new Product(input, price);
                calculator.add(product);
                System.out.println("Товар успешно добавлен в калькулятор!");
            }
        }
        scanner.close();
        calculator.printProducts(usersNumber);
    }
}