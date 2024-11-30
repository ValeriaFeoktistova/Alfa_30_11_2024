// 4. Задание по работе с коллекциями:
// Создайте список (List) строковых значений и добавьте в него несколько элементов. Затем напишите код,
// который перебирает элементы списка и выводит на экран только те строки, которые начинаются с буквы "а" (или другой заданной буквы)

package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("avocado");
        words.add("grape");
        words.add("apricot");
        words.add("orange");

        char ch = 'a';

        words.stream()
                .filter(word -> word.toLowerCase().charAt(0) == Character.toLowerCase(ch))
                .forEach(System.out::println);
    }
}


