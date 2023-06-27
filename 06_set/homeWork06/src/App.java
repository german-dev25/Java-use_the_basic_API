import java.util.HashSet;
import java.util.Set;

import model.Camera;
import model.Laptop;
import model.Categories.*;
import model.additional.Manufacturer.CameraManufacturer;
import model.additional.Manufacturer.LaptopManufacturer;
import model.additional.UnitCamera.*;
import model.additional.UnitLaptop.*;
import model.additional.UnitProduct.*;


public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Базовое задание:
         * Подумать над структурой класса Ноутбук (или Единорогов) для магазина техники
         * выделить поля и методы. Реализовать в java.
         * 
         * Создать множество ноутбуков.
         * Переопределить toString, equals и hashCode (как на семинаре).
         * Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один
         * экземпляр в наборе.
         * 
         * Написать метод, который будет запрашивать у пользователя критерий (или
         * критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
         * фильтрации можно хранить в Map. Например:
         * “Введите цифру, соответствующую необходимому критерию:
         * 1 - ОЗУ
         * 2 - Объем ЖД
         * 3 - Операционная система
         * 4 - Цвет …
         * Далее нужно запросить минимальные значения для указанных критериев -
         * сохранить параметры фильтрации можно также в Map.
         * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
         * условиям.
         */

        Set<Laptop> laptops = new HashSet<>();
        // создаем объекты
        Laptop laptop1 = new Laptop(
                "L001",
                "Laptop 1",
                "Description 1",
                2021,
                1500.0,
                10,
                2.5,
                Rating.RATING_5,
                Category.LAPTOP,
                Subcategory.GAMING_LAPTOP,
                Inch.INCH_15,
                ColorLaptop.BLACK,
                Ram.RAM_256MB,
                Storage.STORAGE_2TB,
                Processor.PROCESSOR_INTEL,
                LaptopManufacturer.LENOVO);

        Laptop laptop2 = new Laptop(
                "A123",
                "Laptop 1",
                "Description 1",
                2021,
                1000.0,
                10.0,
                2.5,
                new Rating("4"),
                Category.LAPTOP,
                Subcategory.GAMING_LAPTOP,
                Inch.INCH_15,
                ColorLaptop.BLACK,
                Ram.RAM_8GB,
                Storage.STORAGE_512GB,
                Processor.PROCESSOR_INTEL,
                LaptopManufacturer.APPLE);

        Laptop laptop3 = new Laptop(
                "B456",
                "Laptop 2",
                "Description 2",
                2022,
                1500.0,
                5.0,
                3.0,
                new Rating("5"),
                Category.LAPTOP,
                Subcategory.WORK_LAPTOP,
                Inch.INCH_15,
                ColorLaptop.GREY,
                Ram.RAM_16GB,
                Storage.STORAGE_1TB,
                Processor.PROCESSOR_ARM,
                LaptopManufacturer.LENOVO);

        Laptop laptop4 = new Laptop(
                "B456",
                "Laptop 2",
                "Description 2",
                2022,
                1500.0,
                5.0,
                3.0,
                new Rating("5"),
                Category.LAPTOP,
                Subcategory.WORK_LAPTOP,
                Inch.INCH_15,
                ColorLaptop.GREY,
                Ram.RAM_16GB,
                Storage.STORAGE_1TB,
                Processor.PROCESSOR_ARM,
                LaptopManufacturer.LENOVO);

        // добавляем их во множество
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        // выводим в консоль данные
        for (Laptop laptop : laptops)
            System.out.println(laptop + "\n");

        // сравниваем разные
        System.out.println(laptop1.equals(laptop2)
                ? "Ноутбуки равны"
                : "Ноутбуки не равны");

        // сравниваем одинаковые
        System.out.println(laptop3.equals(laptop4)
                ? "Ноутбуки равны"
                : "Ноутбуки не равны");

        // ноутбук для поиска в наборе
        Laptop laptopToFind = new Laptop(
                "A123",
                "Laptop 1",
                "Description 1",
                2021,
                1000.0,
                10.0,
                2.5,
                new Rating("4"),
                Category.LAPTOP,
                Subcategory.GAMING_LAPTOP,
                Inch.INCH_15,
                ColorLaptop.BLACK,
                Ram.RAM_8GB,
                Storage.STORAGE_512GB,
                Processor.PROCESSOR_INTEL,
                LaptopManufacturer.APPLE);

        // поиск в наборе
        System.out.println(laptops.contains(laptopToFind)
                ? "Присутствует во множестве"
                : "Отсутствует во множестве");

        Camera testCamera1 = new Camera("C012", "EOS 6D", "Camera description", 2000, 1100, 50, 1500, new Rating("5"), Category.CAMERA, Subcategory.SLR_CAMERA, Megapixel.MP_12, ColorCamera.BLUE, SensorType.CMOS, CameraManufacturer.CANON);

        System.out.println(testCamera1);
    }
}