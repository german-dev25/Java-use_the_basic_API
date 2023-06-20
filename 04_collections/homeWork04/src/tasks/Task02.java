package tasks;

import java.util.LinkedList;

// создаем класс 
public class Task02<T> {
    // приватное поле для хранения связанного списка с элементами типа Т
    private LinkedList<T> queue;

    // конструктор класс
    public Task02() {
        queue = new LinkedList<>();
    }

    public static void run() {
        // создаем объект
        Task02<Integer> queue = new Task02<>();

        // пример работы: добавление, вывод, удаление и тд
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("First element: " + queue.first());

        int removedElement = queue.dequeue();
        System.out.println("Deleted element: " + removedElement);

        System.out.println("Новый первый элемент: " + queue.first());

        queue.enqueue(40);

        System.out.println("Элементы очереди:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

    // добавление элемента в конец связанного списка
    public void enqueue(T element) {
        queue.addLast(element);
        ;
    }

    // возвращаем первый элемент, удаляя его
    public T dequeue() {
        return queue.pollFirst();
    }

    // возвращаем первый элемент, не удаляя его
    public T first() {
        return queue.peekFirst();
    }

    // проверяем, пустая ли очередь
    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
