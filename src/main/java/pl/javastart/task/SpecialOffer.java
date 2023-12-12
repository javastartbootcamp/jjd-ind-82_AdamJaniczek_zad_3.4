package pl.javastart.task;

import java.time.LocalDate;
import java.time.LocalTime;

public class SpecialOffer {
    Product product;
    String description;
    double discount;
    double discountPrice;
    LocalDate startOfSale;
    LocalDate endOfSale;

    @SuppressWarnings("checkstyle:WhitespaceAround")
    SpecialOffer(Product product, String description, LocalDate startOfSale, int duration, double discount) {
        this.product = product;
        this.description = description;
        this.startOfSale = startOfSale;
        this.discount = discount;
        this.startOfSale = startOfSale;
        endOfSale = LocalDate.of(startOfSale.getYear(), startOfSale.getMonth(), startOfSale.getDayOfMonth() + duration);
        this.discountPrice = product.price - (product.price * (discount  / 100));
    }

    double discountPrice(double price, int discount) {
        return this.discountPrice;
    }

    void showInfo() {
        System.out.println("SUPER PROMOCJA kup w terminie od " + startOfSale + " do" + endOfSale);
        System.out.println(product.name + " w nowej niższej cenie o " + discount + " % za jedyne " + this.discountPrice + " zł");
        System.out.println("Cena regularna: " + product.price + " zł");
    }
}
