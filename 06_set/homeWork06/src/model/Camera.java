package model;

import java.util.Objects;

import model.Categories.Category;
import model.Categories.Subcategory;
import model.additional.Manufacturer;
import model.additional.TextData.*;
import model.additional.UnitProduct.*;
import model.additional.UnitCamera.*;

public class Camera extends Product {
    // Поля фотокамеры
    private Category category;
    private Subcategory subcategory;
    private Megapixel resolution;
    private ColorCamera color;
    private SensorType sensorType;
    private Manufacturer manufacturer;

    // Конструктор класса фотокамера
    public Camera(String article, String name, String description,
            int year, double price, double quantity, double weight,
            Rating rating, Category category, Subcategory subcategory, Megapixel resolution, ColorCamera color, SensorType sensorType, Manufacturer manufacturer) {

        super(new Article(article), new Name(name), new Description(description), new Year(year), new Ruble(price),
                new Quantity(quantity), rating, new Weight(weight), manufacturer);

        this.category = category;
        this.subcategory = subcategory;
        this.resolution = resolution;
        this.color = color;
        this.sensorType = sensorType;
        this.manufacturer = manufacturer;
    }

    // Геттеры
    public Category getCategory() {
        return category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public Megapixel getResolution() {
        return resolution;
    }

    public ColorCamera getColor() {
        return color;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    // Переопределяем toString, hashCode, equals
    @Override
    public String toString() {
        return super.toString() + "\n" +
                category + "\n" +
                subcategory + "\n" +
                resolution + "\n" +
                color + "\n" +
                sensorType + "\n" +
                manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, subcategory, resolution, color, sensorType, manufacturer);
    }

    @Override
    public boolean equals(Object obj) {
        // Если полученный объект - тот же объект, с которым сравниваем
        if (this == obj)
            return true;
        // Если пустой или другой класс
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Проходим по полям (поля из Product не смог взять, да и смысла мало вижу)
        Camera other = (Camera) obj;
        return category == other.category
                && subcategory == other.subcategory
                && resolution == other.resolution
                && color == other.color
                && sensorType == other.sensorType
                && manufacturer == other.manufacturer;
    }
}

