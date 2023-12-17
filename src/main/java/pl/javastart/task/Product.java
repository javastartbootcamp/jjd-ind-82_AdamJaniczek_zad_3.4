package pl.javastart.task;

public class Product {
    String name;
    double price;
    Category category;

    Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = new Category();
    }

    void showInfo() {
        System.out.println("Nazwa produktu: " + name + " " + price + " zł.");
        category.showInfo();
        System.out.println();
    }
}
