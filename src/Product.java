//4. Crie uma classe Product com atributos name e price. Crie uma classe
//ProductManager com uma lista estática de produtos e métodos estáticos para
//adicionar, remover e listar todos os produtos.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{Name='" + name + "', Price=" + price + "}";
    }
}

class ProductManager {
    private static List<Product> products = new ArrayList<>();

    // Method to add a product
    public static void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Product added: " + product);
    }

    // Method to remove a product by name
    public static void removeProduct(String name) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                iterator.remove();
                System.out.println("Product removed: " + product);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }

    // Method to list all products
    public static void listProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product list:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
