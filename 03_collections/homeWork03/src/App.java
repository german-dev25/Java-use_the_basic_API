import java.util.List;

import tasks.Task01;
import tasks.Task02;
import tasks.Task03;
import tasks.Utils;
import tasks.Utils.ReturnType;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Task_0️⃣1️⃣
         * Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
         * 
         * Task_0️⃣2️⃣
         * Пусть дан произвольный список целых чисел.
         * Удалить из него четные числа
         * 
         * Task_0️⃣3️⃣
         * Задан целочисленный список ArrayList
         * Найти минимальное, максимальное и среднее из этого списка.
         */

        for (int i = 1; i <= 3; i++) {
            final int taskIndex = i;
            // анонимная лямбда, чтобы запустить с оберткой
            Utils.executeTaskWithSeparator(() -> {
                switch (taskIndex) {
                    case 1 -> Task01.sortMethodSwitcher(
                            new int[][] {
                                    (int[]) Utils.generateRandomData(ReturnType.ARRAY),
                                    (int[]) Utils.generateRandomData(ReturnType.ARRAY)
                            });
                    case 2 -> Task02.removeEvenNumbers(
                            (List<Integer>) Utils.generateRandomData(ReturnType.LIST));
                    case 3 -> Task03.dataResult(
                            (List<Integer>) Utils.generateRandomData(ReturnType.LIST));
                    // Type safety: Unchecked cast from Object to List<Integer>Java(16777761)
                    // 🧐🤔👨🏻‍💻 желтым подчеркивает //
                }
            });
        }

    }
}
