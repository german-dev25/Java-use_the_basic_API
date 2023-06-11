import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task04 {
    // получаем логгер
    private static final Logger logger = Logger.getLogger(Task04.class.getName());

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1-е число: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введите операцию: ");
        String operator = scanner.next();

        System.out.print("Введите 2-е число: ");
        double operand2 = scanner.nextDouble();

        double result = calcSwitch(operand1, operator, operand2);
        System.out.println(result);

        // логируем результат
        logger.log(Level.INFO, "Результат вычисления: {0}", result);
    }

    private static double calcSwitch(double operand1, String operator, double operand2) {
        double result = 0;
        switch (operator) {
            case "+" -> result = operand1 + operand2;
            case "-" -> result = operand1 - operand2;
            case "*" -> result = operand1 * operand2;
            case "/" -> result = operand1 / operand2;
            default -> {
                // логгируем ошибку
                logger.log(Level.WARNING, "Некорректный оператор: {0}", operator);
                return 0.0;
            }
        }
        return result;
    }
}
