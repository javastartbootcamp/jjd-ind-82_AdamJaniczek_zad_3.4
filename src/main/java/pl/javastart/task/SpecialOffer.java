package pl.javastart.task;

import java.time.LocalDate;
import java.time.LocalTime;

public class SpecialOffer {
    Product product;
    String description;
    int discount;
    LocalDate startOfSale;
    LocalDate endOfSale;

    SpecialOffer(Product product, String description, LocalDate startOfSale, int duration, int discount) {
        this.product = product;
        this.description = description;
        this.startOfSale = startOfSale;
        this.discount = discount;
        this.startOfSale = startOfSale;
        endOfSale = LocalDate.of(startOfSale.getYear(), startOfSale.getMonth(), startOfSale.getDayOfMonth() + duration);
    }

    double getDiscount(double price, int discount) {
        double newPrice = price - (price * discount);
        return newPrice;
    }
}
