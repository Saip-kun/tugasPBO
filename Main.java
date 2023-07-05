public interface Product {
    void operation();
}

public class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("Doing operation in ConcreteProductA");
    }
}

public class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("Doing operation in ConcreteProductB");
    }
}

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        } else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        productA.operation(); // Output: Doing operation in ConcreteProductA

        Product productB = ProductFactory.createProduct("B");
        productB.operation(); // Output: Doing operation in ConcreteProductB
    }
}
