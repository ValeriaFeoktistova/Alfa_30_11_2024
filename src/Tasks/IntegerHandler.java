// 5. Задание
// Напишите программу, которая запрашивает у пользователя целое число. Обработайте исключение,
// если пользователь вводит не число (например, текст), и выведите сообщение об ошибке

package Tasks;

import java.util.Scanner;

public class IntegerHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        try {
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (Exception e) {
            System.out.println("Ошибка: введено не целое число. Пожалуйста, введите целое число.");
        } finally {
            scanner.close();
        }
    }
}

