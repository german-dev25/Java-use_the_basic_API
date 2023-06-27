package model;

public class Categories {
    public static class Category {
        private String name;

        public static final Category LAPTOP = new Category("Laptop");
        public static final Category CAMERA = new Category("Camera");

        public Category(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Категория: " + name;
        }
    }

    public static class Subcategory {
        private String name;

        public static final Subcategory GAMING_LAPTOP = new Subcategory("Gaming Laptop");
        public static final Subcategory WORK_LAPTOP = new Subcategory("Work Laptop");

        public static final Subcategory SLR_CAMERA = new Subcategory("SLR camera");
        public static final Subcategory ACTION_CAMERA = new Subcategory("Action camera");

        public Subcategory(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Подкатегория: " + name;
        }
    }

}