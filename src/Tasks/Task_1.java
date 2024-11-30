// 1. Задание:
// Напишите программу на Java, которая запрашивает у пользователя два числа и выводит их сумму.

package Tasks;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите первое число: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Сумма чисел: " + (firstNumber + secondNumber));
        }
    }
}

