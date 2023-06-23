import tasks.Task01;
import tasks.Task03;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Task0️⃣1️⃣
         * Реализуйте структуру телефонной книги с помощью HashMap. Программа также
         * должна учитывать, что во входной структуре будут повторяющиеся имена с
         * разными телефонами, их необходимо считать, как одного человека с разными
         * телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.(можно
         * выводить без сортировки, но обязательно в отдельном методе)
         * 
         * Task0️⃣2️⃣
         * Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в
         * Интернете и включить в проект)
         * 
         * Task_0️⃣3️⃣🌟
         * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга
         * 
         * Task_0️⃣4️⃣🌟
         * Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой
         * клетке была строго один раз
         */

        Task01.run();
        Task01.runWithHeapSort();
        Task03.run();
    }
}
