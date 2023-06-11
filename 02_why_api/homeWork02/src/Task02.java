import java.io.FileWriter;
import java.io.IOException;

public class Task02 {
    public static void bubbleSort() {
        // очищаем лог-файл при запуске
        clearLogFile();

        // создаем массив рандомной длины из рандомных чисел
        int[] array = generateRandomArray();
        int n = array.length;

        // переменная, для проверки была ли сделана сортировка
        boolean isSorted;

        // цикл, который выполняется в любом случае пока сортировка нужна и происходит
        // (до тех пор пока isSorted не останется со значением false после прохождения
        // цикла)
        do {
            isSorted = false;

            for (int i = 1; i < n; i++) {
                // если i-й элемент меньше предыдущего - сортируем
                // и флаг true в isSorted (цикл повторится)
                if (array[i - 1] > array[i]) {
                    sort(array, i - 1, i);
                    isSorted = true;
                }
            }
            n--;

            // функция вывода в файл текущего состояния массива
            logArrayInFile(array);
        } while (isSorted);
    }

    // метод генерирующий массив рандомной длины [4:10] с рандомными числами [1:100]
    private static int[] generateRandomArray() {
        int length = (int) (Math.random() * 7) + 4;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }

    // сортировка/замена местами с использованием промежуточного хранилища temp
    private static void sort(int[] array, int i, int j) {
        // array[i] = array[i] + array[j] - (array[j] = array[i]);
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // метод для записи в файл
    private static void logArrayInFile(int[] array) {
        // пробуем записать в файл данные (закрытие файла автоматическое)
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            // цикл записи - берем каждое значение из массива
            for (int num : array) writer.write(num + " ");
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // метод для очистки файла лога
    private static void clearLogFile() {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
