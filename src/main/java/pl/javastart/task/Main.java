package pl.javastart.task;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Category dairyProduce = new Category("Nabiał", "Idealnie zwiększa ilość wapnia, potasu oraz magnezu.");
        Product milk = new Product("Mleko Uchate", 3.6, dairyProduce);
        Product cheese = new Product("Ser gouda", 6.3, dairyProduce);
        LocalDate startOfSale = LocalDate.of(2023, 12, 10);
        SpecialOffer saleOftheWeek = new SpecialOffer(milk, "Produkty mlecznie są zdrowe", startOfSale, 14, 20);
        System.out.println(saleOftheWeek.discount);
    }
}
