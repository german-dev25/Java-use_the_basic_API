package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {
    // константы в перечислении для вызова,
    // чтобы generateRandomData() были ограничены варианты
    public enum ReturnType {
        LIST,
        ARRAY
    }

    // создаем объекты - массив и список - заполненных рандомно
    public static Object generateRandomData(ReturnType returnType) {
        Random random = new Random(); // объек Random
        int size = random.nextInt(7) + 4; // случайный размер
        Object result; // Объект для return

        // полученный тип через switch запускает
        // создание Списка/Массива, наполнение и return
        switch (returnType) {
            case LIST -> {
                List<Integer> list = new ArrayList<>(size);
                for (int i = 0; i < size; i++)
                    list.add(random.nextInt(100) + 1);
                result = list;
            }
            case ARRAY -> {
                int[] array = new int[size];
                for (int i = 0; i < size; i++)
                    array[i] = random.nextInt(100) + 1;
                result = array;
            }
            default -> throw new IllegalArgumentException("Некорректный тип");
        }

        return result;
    }

    // executeTaskWithSeparator и интерфейс Task для обертки
    public static void executeTaskWithSeparator(Task task) {
        String separator = "=".repeat(50);
        System.out.println(separator);
        task.run();
        System.out.println(separator);
    }

    public interface Task {
        void run();
    }
}

// // генерируем рандомный массив длиной [4:10] числами [1:100]
// public static int[] generateRandomArray() {
// Random random = new Random();
// int length = random.nextInt(7) + 4;
// int[] array = new int[length];

// for (int i = 0; i < length; i++) {
// array[i] = random.nextInt(100) + 1;
// }

// return array;
// }

// // генерируем рандомный список из чисел
// public static List<Integer> generateRandomList() {
// Random random = new Random();
// int length = random.nextInt(10) + 5;
// List<Integer> list = new ArrayList<>();

// for (int i = 0; i < length; i++) {
// list.add(random.nextInt(100) + 1);
// }

// return list;
// }