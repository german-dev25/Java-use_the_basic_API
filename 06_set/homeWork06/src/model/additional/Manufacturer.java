package model.additional;

public class Manufacturer {
    private String name;
    private String country;

    public Manufacturer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // ноутбуки
    public static class LaptopManufacturer {
        public static final Manufacturer APPLE = new Manufacturer("Apple", "USA");
        public static final Manufacturer DELL = new Manufacturer("Dell", "USA");
        public static final Manufacturer HP = new Manufacturer("HP", "USA");
        public static final Manufacturer LENOVO = new Manufacturer("Lenovo", "China");
        public static final Manufacturer ASUS = new Manufacturer("ASUS", "Taiwan");
    }

    // фотокамеры
    public static class CameraManufacturer {
        public static final Manufacturer CANON = new Manufacturer("Canon", "Japan");
        public static final Manufacturer NIKON = new Manufacturer("Nikon", "Japan");
        public static final Manufacturer SONY = new Manufacturer("Sony", "Japan");
        public static final Manufacturer GOPRO = new Manufacturer("GoPro", "USA");
        public static final Manufacturer DJI = new Manufacturer("DJI", "China");
    }

    // геттеры
    public String getManufacturerName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Производитель: " + name + " (" + country + ")";
    }

}