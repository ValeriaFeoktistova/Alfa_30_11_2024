// 1. Задание:
// Напишите программу на Java, которая запрашивает у пользователя два числа и выводит их сумму.

package Tasks;

import java.util.Scanner;

public class SumChisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double fistNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Сумма чисел: " + fistNumber + secondNumber);

        scanner.close();
    }
}
