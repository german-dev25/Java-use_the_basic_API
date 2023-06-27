package model;

import java.util.Objects;

import model.Categories.Category;
import model.Categories.Subcategory;
import model.additional.Manufacturer;
import model.additional.TextData.*;
import model.additional.UnitLaptop.*;
import model.additional.UnitProduct.*;

public class Laptop extends Product {
    // поля ноутбука
    private Category category;
    private Subcategory subcategory;
    private Inch screenSize;
    private ColorLaptop color;
    private Ram ram;
    private Storage storage;
    private Processor processor;
    private Manufacturer manufacturer;

    // конструктор класса ноутбук
    public Laptop(String article, String name, String description,
            int year, double price, double quantity, double weight,
            Rating rating, Category category, Subcategory subcategory, Inch screenSize, ColorLaptop color,
            Ram ram, Storage storage, Processor processor, Manufacturer manufacturer) {

        super(new Article(article), new Name(name), new Description(description), new Year(year), new Ruble(price),
                new Quantity(quantity), rating, new Weight(weight), manufacturer);

        this.category = category;
        this.subcategory = subcategory;
        this.screenSize = screenSize;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
        this.manufacturer = manufacturer;
    }

    // геттеры
    public Category getCategory() {
        return category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public Inch getScreenSize() {
        return screenSize;
    }

    public ColorLaptop getColor() {
        return color;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    // переопределяем toString, hashCode, equals
    @Override
    public String toString() {
        return super.toString() + "\n" +
                category + "\n" +
                subcategory + "\n" +
                screenSize + "\n" +
                color + "\n" +
                ram + "\n" +
                storage + "\n" +
                processor + "\n" +
                manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, subcategory, screenSize, color, ram, storage, processor,manufacturer);
    }

    @Override
    public boolean equals(Object obj) {
        // если полученный объект - тот же объект с которым сравниваем
        if (this == obj)
            return true;
        // если пустой или другой класс
        if (obj == null || getClass() != obj.getClass())
            return false;

        // проходим по полям (поля из Product не смог взять, да и смысла мало вижу)
        Laptop other = (Laptop) obj;
        return category == other.category
                && subcategory == other.subcategory
                && screenSize == other.screenSize
                && color == other.color
                && ram == other.ram
                && storage == other.storage
                && processor == other.processor
                && manufacturer == other.manufacturer;
    }
}