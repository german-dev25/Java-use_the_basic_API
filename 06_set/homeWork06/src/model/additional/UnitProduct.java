package model.additional;

// класс единиц измерения и данных по умолчанию
public class UnitProduct {
    // рубли
    public static class Ruble {
        public double value;

        public Ruble(double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Цена: " + value + " руб.";
        }
    }

    // год
    public static class Year {
        private int value;

        public Year(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Год выпуска: " + value + " год";
        }
    }

    // вес
    public static class Weight {
        public double value;

        public Weight(double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            if (value >= 1000) {
                double kgValue = value / 1000.0;
                return "Вес: " + kgValue + " кг";
            } else {
                return "Вес: " + value + " г";
            }
        }
    }

    // количество
    public static class Quantity {
        public double value;

        public Quantity(double value) {
            this.value = value;
        }

        public static Quantity of(double value) {
            return new Quantity(value);
        }

        public Quantity add(Quantity other) {
            return Quantity.of(this.value + other.value);
        }

        public Quantity subtract(Quantity other) {
            double newValue = this.value - other.value;
            return Quantity.of(Math.max(newValue, 0));
        }

        @Override
        public String toString() {
            return "На складе: " + value + " шт.";
        }
    }

    // рейтинг
    public static class Rating {
        private String value;

        public Rating(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Рейтинг: " + value;
        }

        public static final Rating RATING_1 = new Rating("1");
        public static final Rating RATING_2 = new Rating("2");
        public static final Rating RATING_3 = new Rating("3");
        public static final Rating RATING_4 = new Rating("4");
        public static final Rating RATING_5 = new Rating("5");
    }

}