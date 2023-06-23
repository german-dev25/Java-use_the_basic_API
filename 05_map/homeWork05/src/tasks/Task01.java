package tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task01 {
    // поля и конструктор. Т.к. номер телефона большое число (Long),
    // то использовал List<String> вместо List<Integer>/<Long>
    private Map<String, List<String>> contacts;

    public Task01() {
        contacts = new HashMap<>();
    }

    // метод computeIfAbsent: если ключ name есть в contacts,
    // то получаем список номеров, иначе создаем новый список
    // и добавляем в него номер, возвращаем с ключом name
    private void addContact(String name, String number) {
        contacts.computeIfAbsent(name, k -> new ArrayList<>())
                .add(number);
    }

    // вывод контактов: создаем Список allContacts
    // в который получаем Записи (Map.Entry) пар Строка-Список Строк
    private void printContacts() {
        List<Map.Entry<String, List<String>>> allContacts = new ArrayList<>();
        allContacts.addAll(contacts.entrySet());

        // сортируем по размеру Cписка телефонов
        allContacts.sort(
                (a, b) -> b.getValue().size() - a.getValue().size());

        // выводим сортированный список
        for (Map.Entry<String, List<String>> contact : allContacts) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }

    // аналогично, только с сортировкой HeapSort
    private void printContactsWithHeapSort() {
        List<Map.Entry<String, List<String>>> allContacts = new ArrayList<>();
        allContacts.addAll(contacts.entrySet());

        Task02.heapSort(allContacts, Comparator.comparingInt(e -> e.getValue().size()));

        for (Map.Entry<String, List<String>> contact : allContacts) {
            System.out.println(contact.getKey() + ": " + contact.getValue());
        }
    }

    public static void run() {
        Task01 phoneBook = new Task01();

        phoneBook.addContact("Vasya", "89008850000");
        phoneBook.addContact("Olya", "89018850000");
        phoneBook.addContact("Nikita", "89028850001");
        phoneBook.addContact("Olya", "89018850001");
        phoneBook.addContact("Nikita", "89028850000");
        phoneBook.addContact("Olya", "89028850002");

        phoneBook.printContacts();
    }

    public static void runWithHeapSort() {
        Task01 phoneBook = new Task01();

        phoneBook.addContact("Petya", "89008850000");
        phoneBook.addContact("Olya", "89018850000");
        phoneBook.addContact("Petya", "89028850001");
        phoneBook.addContact("Julia", "89018850001");
        phoneBook.addContact("Julia", "89028850000");
        phoneBook.addContact("Petya", "89028850002");

        phoneBook.printContactsWithHeapSort();
    }
}