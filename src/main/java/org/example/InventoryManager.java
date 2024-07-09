package org.example;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    List<Product> products = new ArrayList<>();

    public InventoryManager() {
        this.products = products;
    }

    public void addNewProduct(Product prod) {
        products.add(prod);
    }

    public void showAllProducts() {
        products.stream().forEach(System.out::println);
    }

    public void removeProduct(int index) {
//        products.remove(index);
        try {
            Product prod = products.get(index);
            if (null != prod) {
                products.remove(index);
            }
        } catch (Exception e) {
            System.out.println("Product with index :" + index + " not found");
        }
    }

    public Product searchByCategory(String category) {
        for (Product prod : products) {
            if (category.equalsIgnoreCase(prod.getCategory())) {
                return prod;
            }
        }
        return null;
    }

    public Product searchById(int pid) {
        for (Product prod : products) {
            if (pid == prod.getId()) {
                return prod;
            }
        }
        return null;
    }

    public void updateProductById(int pid, int quantity) {
        Product prods = searchById(pid);
        if (prods != null) {
            prods.setQuantity(quantity);
        }
    }

    public Product getProductWithLowestQuantity() {
        if (products.isEmpty()) {
            return null;
        }
        Product lowestQuantityProduct = products.get(0);
        for (Product product : products) {
            if (product.getQuantity() < lowestQuantityProduct.getQuantity()) {
                lowestQuantityProduct = product;
            }
        }
        return lowestQuantityProduct;
    }
}


