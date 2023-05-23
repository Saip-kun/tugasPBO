package tokoOnline2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Smartphone", 4000000);
        productElectronic productElectronic = new productElectronic("Smart TV", 1500000, "Samsung");

        product.displayInfo();
        System.out.println();
        productElectronic.displayInfo();
    }
}
