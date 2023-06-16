package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void removeEvenNumbers(List<Integer> numbers) {
        System.out.println("Исходный список: " + numbers);

        // Удаляем четные числа из списка (хотя можно было короче
        // по идее, методом) 👉🏻 numbers.removeIf(number -> number % 2 != 0);
        removerEvenNumbers(numbers);

        System.out.println("Список после удаления четных чисел: " + numbers);
    }

    public static void removerEvenNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        // формируем список из нечетных чисел
        for (Integer number : numbers) {
            if (number % 2 != 0)
                oddNumbers.add(number);
        }

        // очищаем старый список и добавляем результат
        numbers.clear();
        numbers.addAll(oddNumbers);
    }
}
