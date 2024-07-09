package org.example;

public class Main {

    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        inventoryManager.addNewProduct((new Product(101, "Laptop", "Electronics", 10)));
        inventoryManager.addNewProduct((new Product(102, "T-shirt", "Clothes", 50)));
        inventoryManager.addNewProduct((new Product(103, "Headphones", "Electronics", 20)));
        inventoryManager.addNewProduct((new Product(104, "Jeans", "Clothes", 30)));
        inventoryManager.addNewProduct((new Product(105, "Sun-Screen", "Cosmotics", 10)));

        System.out.println("List of all Products : ");
        inventoryManager.showAllProducts();
        System.out.println();

        System.out.println("After removing the object based on index : ");
        inventoryManager.removeProduct(1);
        inventoryManager.showAllProducts();
        System.out.println();

        System.out.println("Fetching the list based on category :");
        System.out.println(inventoryManager.searchByCategory("Cosmotics"));
        System.out.println();

        System.out.println("Update the list based on Product ID :");
        inventoryManager.updateProductById(105, 4);
        inventoryManager.showAllProducts();
        System.out.println();

        System.out.println("Get the product based on Lowest Quantity");
        System.out.println(inventoryManager.getProductWithLowestQuantity());
    }
}