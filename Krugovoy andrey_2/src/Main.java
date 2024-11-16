import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрашивает у пользователя ввод первой строки
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine(); // Считывает первую строку

        // Запрашивает у пользователя ввод второй строки
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine(); // Считывает вторую строку

        // Сравнивает две строки
        if (a.equals(b)) { // Метод equals сравнивает строки на идентичность
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}