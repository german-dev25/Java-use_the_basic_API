package tasks;

import java.util.Collections;
import java.util.List;

public class Task03 {
    public static void dataResult(List<Integer> numbers) {
        System.out.println("Полученный список: " + numbers);
        System.out.println("Максимальный элемент: " + Collections.max(numbers));
        System.out.println("Минимальный элемент: " + Collections.min(numbers));
        System.out.printf("Среднее арифмитическое: %.1f\n", average(numbers));
    }

    public static double average(List<Integer> numbers) {
        int sum = 0;
        // 1️⃣ ищем общую сумму чисел в списке циклом
        for (int number : numbers) {
            sum += number;
        }
        // 2️⃣ либо используем метод stream() для преобразования списка numbers в поток
        // элементов и далее mapToInt() для преобразования и получения значения из
        // Integer в int. Далее ищем сумму через метод sum(). Вроде так понял
        // int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        return (float) sum / numbers.size();
    }
}
