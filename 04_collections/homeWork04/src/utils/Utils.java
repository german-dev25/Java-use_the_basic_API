package utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Utils {
    public static boolean isInt(String text) {
        // регулярка на числа (положительные/отрицательные)
        return text.matches("-?\\d+");
    }

    // переворачиваем лист
    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static String inputUser(String msg) {
        System.out.print(msg + " -> ");
        return new Scanner(System.in).nextLine();
    }
}
