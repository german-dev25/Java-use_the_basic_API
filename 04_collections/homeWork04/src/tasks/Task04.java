package tasks;

import utils.Utils;

public class Task04 {
    // задаем поля класса - стэк, стрелка-указатель, допустимый размер,
    // данные для работы с пользовательским вводом
    private static int[] stack;
    private static int topArrow;
    private static int stackMaxSize;
    private static boolean getIteration;
    private static String[] cLine;

    // запускалка с бесконечным циклом. Устанавливаем размер стека,
    // стрелку в позицию -1 и ждем команду от пользователя
    public static void run() {
        printCommands();
        getIteration = true; // +
        stackMaxSize = Integer.parseInt(Utils.inputUser("Enter stack size"));
        stack = new int[stackMaxSize];
        topArrow = -1;

        while (getIteration) {
            String cmd = Utils.inputUser("Enter command");
            cLine = cmd.toUpperCase().split("~");

            // Удаление начальных и конечных пробелов
            for (int i = 0; i < cLine.length; i++) {
                cLine[i] = cLine[i].trim();
            }

            switch (cLine[0]) {
                case "SIZE" -> size();
                case "PUSH" -> push(); // push~SomeData
                case "PEEK" -> peek();
                case "POP" -> pop();
                case "COMMANDS" -> printCommands();
                case "EXIT" -> exit();
            }
        }
    }

    // выводим размер стэка (элементов есть / элементов возможно)
    private static void size() {
        System.out.println((topArrow + 1) + "/" + stackMaxSize);
    }

    // проверяем пустой ли стэк
    private static boolean empty() {
        return topArrow == -1;
    }

    // добавляем элемент
    private static void push() {
        int value = Integer.parseInt(cLine[1]);
        if (topArrow == stackMaxSize - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++topArrow] = value;
            System.out.println("Element " + value + " is added");
        }
        size();
    }

    // показываем элемент
    private static void peek() {
        System.out.println(empty()
                ? "Stack is empty"
                : stack[topArrow]);
        size();
    }

    // показываем и выкидываем элемент (точнее просто смещаем стрелку назад)
    private static void pop() {
        System.out.println(empty()
                ? "Stack is empty"
                : stack[topArrow--]);
        size();
    }

    // список команд
    private static void printCommands() {
        System.out.println("Available commands:");
        System.out.println("PRINT ~ <index> - Print the element at the specified index");
        System.out.println("REMOVE ~ <index> - Remove the element at the specified index");
        System.out.println("LIST - Print the list");
        System.out.println("REVERSE - Print the reversed list");
        System.out.println("COMMANDS - Print the list of commands");
        System.out.println("EXIT - Exit the program");
    }

    // выход
    private static void exit() {
        System.out.println("Good bye");
        getIteration = false;
    }
}
