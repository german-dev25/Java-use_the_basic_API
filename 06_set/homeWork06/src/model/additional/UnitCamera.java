package model.additional;

// класс единиц измерения и данных по умолчанию
public class UnitCamera {
    // цвет
    public static class ColorCamera {
        private String name;

        public ColorCamera(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Цвет: " + name;
        }

        public static final ColorCamera BLACK = new ColorCamera("Черный");
        public static final ColorCamera WHITE = new ColorCamera("Белый");
        public static final ColorCamera GREY = new ColorCamera("Серый");
        public static final ColorCamera RED = new ColorCamera("Красный");
        public static final ColorCamera GREEN = new ColorCamera("Зеленый");
        public static final ColorCamera BLUE = new ColorCamera("Синий");
    }

     public static class Megapixel {
        private int value;

        public Megapixel(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Мегапиксели: " + value + "МП";
        }

        public static final Megapixel MP_12 = new Megapixel(12);
        public static final Megapixel MP_24 = new Megapixel(24);
        public static final Megapixel MP_36 = new Megapixel(36);
    }

    public static class SensorType {
        private String name;

        public SensorType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип сенсора: " + name;
        }

        public static final SensorType CMOS = new SensorType("CMOS");
        public static final SensorType CCD = new SensorType("CCD");
        public static final SensorType BSI_CMOS = new SensorType("BSI-CMOS");
    }
}