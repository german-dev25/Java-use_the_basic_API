package model.additional;

// класс единиц измерения и данных по умолчанию
public class UnitLaptop {
    // диагональ
    public static class Inch {
        private double value;

        public Inch(double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Диагональ: " + value + "\"";
        }

        public static final Inch INCH_15 = new Inch(15);
        public static final Inch INCH_16 = new Inch(16);
        public static final Inch INCH_17 = new Inch(17);
        public static final Inch INCH_18 = new Inch(18);
        public static final Inch INCH_19 = new Inch(19);
        public static final Inch INCH_20 = new Inch(20);
        public static final Inch INCH_21 = new Inch(21);

    }

    // цвет
    public static class ColorLaptop {
        private String name;

        public ColorLaptop(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Цвет: " + name;
        }

        public static final ColorLaptop BLACK = new ColorLaptop("Черный");
        public static final ColorLaptop WHITE = new ColorLaptop("Белый");
        public static final ColorLaptop GREY = new ColorLaptop("Серый");
        public static final ColorLaptop RED = new ColorLaptop("Красный");
        public static final ColorLaptop GREEN = new ColorLaptop("Зеленый");
        public static final ColorLaptop BLUE = new ColorLaptop("Синий");
    }

    // оперативная
    public static class Ram {
        private double value;

        public Ram(double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (value >= 1024) {
                double gbValue = value / 1024.0;
                return "Оперативная память: " + gbValue + " ГБ";
            } else {
                return "Оперативная память: " + value + " МБ";
            }
        }

        public static final Ram RAM_256MB = new Ram(256);
        public static final Ram RAM_512MB = new Ram(512);
        public static final Ram RAM_1GB = new Ram(1024);
        public static final Ram RAM_4GB = new Ram(4096);
        public static final Ram RAM_8GB = new Ram(8192);
        public static final Ram RAM_16GB = new Ram(16384);
        public static final Ram RAM_32GB = new Ram(32768);
    }

    // объем диска
    public static class Storage {
        private double value;

        public Storage(double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (value >= 1000) {
                double tbValue = value / 1000.0;
                return "Дисковая память: " + tbValue + " ТБ";
            } else {
                return "Дисковая память: " + value + " ГБ";
            }
        }

        public static final Storage STORAGE_128GB = new Storage(128);
        public static final Storage STORAGE_256GB = new Storage(256);
        public static final Storage STORAGE_512GB = new Storage(512);
        public static final Storage STORAGE_1TB = new Storage(1024);
        public static final Storage STORAGE_2TB = new Storage(2048);
    }

    // производитель процессора
    public static class Processor {
        private String value;

        public Processor(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Процессор: " + value;
        }

        public static final Processor PROCESSOR_INTEL = new Processor("Intel");
        public static final Processor PROCESSOR_ARM = new Processor("ARM");
    }

}