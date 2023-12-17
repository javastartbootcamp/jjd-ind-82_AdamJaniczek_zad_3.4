package pl.javastart.task;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Category dairyProduce = new Category("Nabiał", "Idealnie zwiększa ilość wapnia, potasu oraz magnezu.");
        Product milk = new Product("Mleko Uchate", 3.6, dairyProduce);
        Product cheese = new Product("Ser gouda", 6.3, dairyProduce);
        Category alcohol = new Category("Alkohol", "Zrelaksuj się na imprezie");
        Product beer = new Product("Tyskie", 3.9, alcohol);
        Product cigarettes = new Product("Marlboro", 16.99);
        LocalDate startOfSale = LocalDate.of(2023, 12, 10);
        SpecialOffer saleOftheWeek = new SpecialOffer(milk, "Produkty mlecznie są zdrowe", startOfSale, 14, 20);
        milk.showInfo();
        cheese.showInfo();
        beer.showInfo();
        cigarettes.showInfo();
        saleOftheWeek.showInfo();
    }
}
