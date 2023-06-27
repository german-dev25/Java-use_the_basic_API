package model;

import java.util.Objects;

import model.additional.Manufacturer;
import model.additional.TextData.*;
import model.additional.UnitProduct.*;

abstract class Product {
    // поля для любой категории продукта магазина
    private static int currentId = 1;
    private int id;
    private Article article;
    private Name name;
    private Description description;
    private Year year;
    private Ruble price;
    private Quantity quantity;
    private Rating rating;
    private Weight weight;


    public Product(Article article, Name name, Description description, Year year, Ruble price, Quantity quantity,
            Rating rating, Weight weight, Manufacturer manufacturer) {
        this.id = currentId++; // полагаю что будет назначаться каждому свой id
        this.article = article;
        this.name = name;
        this.description = description;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
        this.weight = weight;

    }

    // увеличиваем остаток
    public void quantityToAdd(Quantity quantity) {
        this.quantity = this.quantity.add(quantity);
    }

    // уменьшаем остаток
    public void quantityToSubtract(Quantity quantity) {
        /* TODO обработка, если меньше 0 */
        this.quantity = this.quantity.subtract(quantity);
    }

    // геттеры
    public Article getArticle() {
        return article;
    }

    public int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public Year getYear() {
        return year;
    }

    public Ruble getPrice() {
        return price;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Rating getRating() {
        return rating;
    }

    public Weight getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return article + "\n" +
                name + "\n" +
                description + "\n" +
                year + "\n" +
                quantity + "\n" +
                rating + "\n" +
                weight;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}