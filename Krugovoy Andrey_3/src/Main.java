public class Main {
    public static void main(String[] args) {
        // Задаем массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Печатаю четные числа
        System.out.println("Чётные числа в массиве:");

        // Проходит по элементам массива
        for (int number : numbers) {
            // Проверяет, является ли число четным
            if (number % 2 == 0) {
                // Если да, выводим его на консоль
                System.out.println(number);
            }
        }
    }
}