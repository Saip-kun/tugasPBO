package tokoOnline;

public class tokoOnline {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 1000.0);
        ElectronicProduct electronicProduct = new ElectronicProduct("Smart TV", 1500.0, "Samsung");

        product.displayInfo();
        System.out.println();
        electronicProduct.displayInfo();
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
    }
}

class ElectronicProduct extends Product {
    private String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}
