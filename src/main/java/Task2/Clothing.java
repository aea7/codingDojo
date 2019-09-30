package Task2;

public class Clothing extends Product{

    private String name;
    private String description;
    private double price;
    private String material;
    private int size;

    public Clothing() {

    }

    public Clothing(String name, String description, double price, String material, int size) {
        super(name, description, price);
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " With Material: " + material + " and size: " + size;
    }
}
