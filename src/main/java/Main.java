import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int usersNumber = UserInput.readUsersNumber();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Calculator calculator = new Calculator();
        String input = "";
        while(!input.trim().equalsIgnoreCase("завершить")) {
            System.out.print("Введите название товара или команду \"Завершить\": ");
            input = scanner.nextLine();
            if (!input.trim().equalsIgnoreCase("завершить")) {
                double price;
                System.out.print("Введите стоимость товара в формате рубли.копейки (например, 10.45): ");
                do {
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Введите числовое значение стоимости товара: ");
                        scanner.next();
                    }
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    if (price < 0) {
                        System.out.println("Стоймость товара не может быть отрицательной. Пожалуйста, введите положительное число: ");
                    }
                } while (price < 0);
                Product product = new Product(input, price);
                calculator.add(product);
                System.out.println("Товар успешно добавлен в калькулятор!");
            }
        }
        scanner.close();
        calculator.printProducts(usersNumber);
    }
}