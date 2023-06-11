public class App {
        public static void main(String[] args) throws Exception {
                /*
                 * Task_01
                 * Дана строка sql-запроса "select * from students where ".
                 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
                 * Данные для фильтрации приведены ниже в виде json-строки.
                 * Если значение null, то параметр не должен попадать в запрос.
                 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
                 * "city":"Moscow", "age":"null"}
                 */
                String jsonString01 = """
                                {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
                                     """;
                Task01.makeWhere(
                                "SELECT * FROM students WHERE ",
                                jsonString01);

                /*
                 * Task_02
                 * Реализуйте алгоритм сортировки пузырьком числового массива,
                 * результат после каждой итерации запишите в лог-файл.
                 */
                Task02.bubbleSort();

                /*
                 * Task_03
                 * Дана json-строка (можно сохранить в файл и читать из файла)
                 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":
                 * "Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка"
                 * :"5","предмет":"Физика"}]
                 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
                 * строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
                 * Пример вывода:
                 * Студент Иванов получил 5 по предмету Математика.
                 * Студент Петрова получил 4 по предмету Информатика.
                 * Студент Краснов получил 5 по предмету Физика.
                 */
                String jsonString03 = """
                                [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
                                """;
                Task03.parser(jsonString03);

                /* Task_04
                 * К калькулятору из предыдущего ДЗ добавить логирование.
                 */
                Task04.calculator();
        }
}
