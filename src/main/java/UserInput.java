import java.util.Scanner;

public class UserInput {
    private static Scanner scanner;
    public static int readUsersNumber() {
        scanner = new Scanner(System.in);
        System.out.println("Введите количество пользователей:");
        while(!scanner.hasNextInt()) {
            System.out.println("Введите число");
            scanner.next();
        }
        int usersNumber = scanner.nextInt();
        return getValidNumber(usersNumber);
    }

    private static int getValidNumber(int usersNumber) {
        while(usersNumber <= 1) {
            System.out.println("Введите количество людей больше 1");
            usersNumber = scanner.nextInt();
        }
        return usersNumber;
    }
}
