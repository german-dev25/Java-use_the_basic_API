package model.additional;

public class TextData {
    public static class Article {
        private String value;

        public Article(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Артикул: " + value;
        }
    }

    public static class Name {
        private String value;

        public Name(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Название: " + value;
        }
    }

    public static class Description {
        private String value;

        public Description(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Описание: " + value;
        }
    }

}
