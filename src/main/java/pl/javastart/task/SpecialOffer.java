package pl.javastart.task;

import java.time.LocalDate;

public class SpecialOffer {
    Product product;
    String description;
    double discount;
    double discountPrice;
    LocalDate startOfSale;
    LocalDate endOfSale;

    SpecialOffer(Product product, String description, LocalDate startOfSale, int saleDurationInDays, double discount) {
        this.product = product;
        this.description = description;
        this.discount = discount;
        this.startOfSale = startOfSale;
        this.endOfSale = startOfSale.plusDays(saleDurationInDays);
        this.discountPrice = product.price - (product.price * (discount / 100));
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
