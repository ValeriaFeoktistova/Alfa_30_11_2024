// 3. Задание
// Напишите программу на Java, которая заполняет массив из 10 целых чисел, а затем выводит на экран только четные числа из этого массива.

package Tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.printf("Число %d:", (i + 1));
                numbers[i] = scanner.nextInt();
            }
        }

        System.out.println("Четные числа из массива:");
        Arrays.stream(numbers)
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.print(number + " "));
    }
}



