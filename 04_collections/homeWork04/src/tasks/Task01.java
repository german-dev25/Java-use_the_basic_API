package tasks;

import java.util.LinkedList;
import java.util.List;
import utils.Utils;

public class Task01 {

    private static LinkedList<String> list = new LinkedList<>();
    private static boolean getIteration;
    private static String[] cLine;

    public static void run() {
        getIteration = true;
        printCommands();
        while (getIteration) {
            String cmd = Utils.inputUser("Enter the command");
            cLine = cmd.toUpperCase().split("~");

            // от лишних пробелов
            for (int i = 0; i < cLine.length; i++) {
                cLine[i] = cLine[i].trim();
            }

            switch (cLine[0]) {
                case "PRINT" -> printElement();
                case "REMOVE" -> removeElement();
                case "LIST" -> printList(false);
                case "REVERSE" -> printList(true);
                case "COMMANDS" -> printCommands();
                case "EXIT" -> exit();
                default -> defaultCmd();
            }
        }
    }

    // метод для добавления в список полученного элемента
    // по индексу, либо в начало
    private static void defaultCmd() {
        if (cLine.length > 1 && Utils.isInt(cLine[1])) {
            adder(cLine, list);
        } else {
            list.addFirst(cLine[0]);
        }
    }

    // добавлялка элементов в список
    private static List<String> adder(String[] splitted, List<String> list) {
        if (Utils.isInt(splitted[1])) {
            int num = Integer.parseInt(splitted[1]);
            int diff = num - list.size();
            if (diff > 0) {
                for (int i = 0; i < diff; i++)
                    list.add(" ");
            }
            list.add(num, splitted[0]);
        }
        return list;
    }

    // удаление элемента по индексу
    private static void removeElement() {
        if (cLine.length > 1 && Utils.isInt(cLine[1])) {
            int index = Integer.parseInt(cLine[1]);
            if (index >= 0 && index < list.size()) {
                list.remove(index);
                System.out.println("Element at index " + index + " removed");
            } else {
                System.out.println("Element at index " + index + " not found");
            }
        } else {
            System.out.println("Invalid index");
        }
    }

    // выводим элемент или пишем, что его нет
    // следим за тем, чтобы пользователь не выходил за пределы списка
    private static void printElement() {
        {
            int index = Integer.parseInt(cLine[1]);
            System.out.println(index >= 0 && index < list.size()
                    ? list.get(index)
                    : "Element at index " + index + " not found");
        }
    }

    // выводим лист (или перевернутый лист) или пишем, что он пустой
    private static void printList(boolean reverse) {
        if (!list.isEmpty()) {
            LinkedList<String> outputList = reverse
                    ? Utils.reverseLinkedList(list)
                    : new LinkedList<>(list);
            while (!outputList.isEmpty()) {
                System.out.println(outputList.pop());
            }
        } else {
            System.out.println("The list is empty");
        }
    }

    // список команд
    private static void printCommands() {
        String commands = "Available commands:\n" +
                "PRINT ~ <index> - Print the element at the specified index\n" +
                "REMOVE ~ <index> - Remove the element at the specified index\n" +
                "LIST - Print the list\n" +
                "REVERSE - Print the reversed list\n" +
                "COMMANDS - Print the list of commands" +
                "EXIT - Exit the program\n";
        System.out.println(commands);
    }

    // выход
    private static void exit() {
        System.out.println("Good bye");
        getIteration = false;
    }
}