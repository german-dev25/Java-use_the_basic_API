package tasks;

import java.util.Arrays;

public class Task01 {

    // переключалка методов
    public static void sortMethodSwitcher(int[][] arrays) {
        for (int[] array : arrays) {
            String methodName = "";
            System.out.println("Входящий массив\n" + Arrays.toString(array));

            // используем 1️⃣/2️⃣ метод сортировки
            if (array == arrays[0]) {
                Arrays.sort(array);
                methodName = "Arrays.sort()";
            } else if (array == arrays[1]) {
                mergeSort(array);
                methodName = "mergeSort()";
            }

            System.out.println("Cортированный методом " + methodName + " массив\n" + Arrays.toString(array));
        }
        
    }

    public static void mergeSort(int[] arr) {
        // проверяем, что массив содержит больше 1 элемента
        // (иначе из рекурсии не выйдем и будем "пополамить" вечно)
        if (arr.length <= 1)
            return;

        // делим массив на левую и правую половину
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        // вызываем для левой/правой половины метод (происходит рекурсия)
        mergeSort(left);
        mergeSort(right);

        // мержим "нарезанный" массив + его левую и правую половины
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0; // счетчики

        // объединяем left и right в один сортированный массив arr
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j])
                    ? left[i++]
                    : right[j++];
        }

        // если остались несортированные элементы в left/в right
        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];
    }
}
