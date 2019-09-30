package Task2;

public class Product {

    private String name;
    private String description;
    private double price;

    public Product() {

    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public final double getPriceWithTax () {
        return price * 1.19;
    }

    @Override
    public String toString() {
        return name + " _ " + description + " _ " + price + " EUR";
    }
}
