// 1. Задание:
// Напишите программу на Java, которая запрашивает у пользователя два числа и выводит их сумму.

package Tasks;

import java.util.Scanner;

public class SummaChisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double chisloOdin = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double chisloDva = scanner.nextDouble();

        double summa = chisloOdin + chisloDva;

        System.out.println("Сумма чисел: " + summa);

        scanner.close();
    }
}
