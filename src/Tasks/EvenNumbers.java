// 3. Задание
// Напишите программу на Java, которая заполняет массив из 10 целых чисел, а затем выводит на экран только четные числа из этого массива.

package Tasks;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nЧетные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}

