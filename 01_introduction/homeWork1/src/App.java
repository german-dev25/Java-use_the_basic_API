/*
 * Задание
*** task01Ver1, task01Ver2 ***
- Вычислить сумму чисел от 1 до n
*** task02 ***
- Вывести все простые числа от 1 до 1000
*** task03 ***
Реализовать простой калькулятор
*** --- ***
Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*** task05t5***
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // task01Ver1();
        // task01Ver2();
        // task02();
        // task03();
        // task05t5();
    }

    private static void task01Ver1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n: ");
        System.out.println(
                task01CalcSum(scanner.nextInt()));
    }

    private static int task01CalcSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static void task01Ver2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;

        System.out.println(sum);
    }

    private static void task02() {
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }

    private static void task03() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1-е число: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введите операцию: ");
        String operator = scanner.next();

        System.out.print("Введите 2-е число: ");
        double operand2 = scanner.nextDouble();

        System.out.println(
                calcSwitch(operand1, operator, operand2));
    }

    private static double calcSwitch(double operand1, String operator, double operand2) {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("некоррентный оператор");
                return 0.0;
        }
        return result;
    }

    private static void task05t5() {
        String phrase = "Добро пожаловать на курс по Java";

        String[] words = phrase.split(" ");
        String reversedPhrase = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedPhrase += words[i] + " ";
        }

        System.out.println(reversedPhrase);
    }
}