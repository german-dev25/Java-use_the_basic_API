public class Task01 {
    public static void makeWhere(String startWhere, String jsonString) {
        StringBuilder stringWhere = new StringBuilder(startWhere);

        // удаление символов { , } и ". разделение строки на пары ключ-значение
        String[] keyAndValue = jsonString.replaceAll("[{}\"]", "")
                .split(", ");

        // цикл "сплитования" пары на ключ и значение, формируем строку
        for (String kv : keyAndValue) {
            String key = kv.split(":")[0].trim();
            String value = kv.split(":")[1].trim();

            // проверяем, что значение не null
            if (!value.equals("null")) {
                // проверяем, что это не первое добавление (т.к. AND не нужен)
                stringWhere.append(stringWhere.length() > startWhere.length() ? " AND " : "")
                        .append(key)
                        .append(" = '")
                        .append(value)
                        .append("'");
            }
        }
        System.out.println(stringWhere);
    }
}
