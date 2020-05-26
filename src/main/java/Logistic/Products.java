package Logistic;

public class Products {
    private int id;
    private String name;
    private float price;
    private char[] picture;

    public Products (int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public char[] getPicture() {
        return picture;
    }
}
