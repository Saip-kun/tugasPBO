public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.operation(); // Output: Doing operation in ConcreteProductA

        Product productB = ProductFactory.createProduct("B");
        productB.operation(); // Output: Doing operation in ConcreteProductB
    }
}
