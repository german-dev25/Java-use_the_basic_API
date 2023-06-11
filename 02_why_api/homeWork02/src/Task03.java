public class Task03 {
    public static void parser(String fullJsonString) {
        StringBuilder resultBuilder = new StringBuilder();

        // создаем массив строк - чистим от лишних пробелов вокруг,
        // убираем [ и ], сплитуем по },{
        String[] allJsonStrings = fullJsonString.trim()
                .replaceAll("[\\[\\]]", "")
                .split("\\},\\{");

        // проходим циклом по каждой json строке из массива
        // и добавляем результат в результирующую строку
        for (String jsonOneString : allJsonStrings) {
            resultBuilder.append(processJsonString(jsonOneString));
        }

        System.out.println(resultBuilder);
    }

    private static String processJsonString(String jsonOneString) {
        String surname = "", grade = "", subject = "";

        // удаляем лишние символы и сплитуем пары ключ-значение
        String[] keyAndValue = jsonOneString.replaceAll("[{}\"]", "")
                .split(",");

        // проходим циклом по каждой паре ключ-значение
        for (String kv : keyAndValue) {
            // сплитуем по двоеточию ключ и значение, получаем их значение
            String key = kv.split(":")[0].trim();
            String value = kv.split(":")[1].trim();

            // сохраняем значения в соответствующих переменных
            switch (key) {
                case "фамилия" -> surname = value;
                case "оценка" -> grade = value;
                case "предмет" -> subject = value;
            }
        }

        // формируем и возвращаем строку с информацией о студенте
        return String.format("Студент %s получил %s по предмету %s.\n", surname, grade, subject);
    }
}
