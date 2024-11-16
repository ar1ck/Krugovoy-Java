import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Запрашивает у пользователя ввод первого числа
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        // Запрашивает у пользователя ввод второго числа
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();
        // Сравнивает a и b
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        // Выполняет операции сложения, вычитания, умножения и деления
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        // Обрабатывает деление отдельно, проверяем на деление на ноль
        if (b != 0) {
            double quotient = (double) a / b; // Приводит к double для получения точного результата
            System.out.println("Результаты операций:");
            System.out.println("Сложение: a + b = " + sum);
            System.out.println("Вычитание: a - b = " + difference);
            System.out.println("Умножение: a * b = " + product);
            System.out.println("Деление: a / b = " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно, b не должно быть равно 0!");
            System.out.println("Сложение: a + b = " + sum);
            System.out.println("Вычитание: a - b = " + difference);
            System.out.println("Умножение: a * b = " + product);
        }

        scanner.close();
    }
}