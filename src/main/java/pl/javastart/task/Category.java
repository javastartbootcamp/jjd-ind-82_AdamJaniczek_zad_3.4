package pl.javastart.task;

public class Category {
    String name;
    String description;

    Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    Category() {
        this.name = "unknown";
        this.description = "unknown";
    }

    void showInfo() {
        System.out.println("Nazwa kategorii: " + name);
        System.out.println("Opis kategorii: " + description);
    }
}
