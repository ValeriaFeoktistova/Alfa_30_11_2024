// 5. Задание
// Напишите программу, которая запрашивает у пользователя целое число. Обработайте исключение,
// если пользователь вводит не число (например, текст), и выведите сообщение об ошибке

package Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число. Пожалуйста, введите целое число.");
        }
    }
}


