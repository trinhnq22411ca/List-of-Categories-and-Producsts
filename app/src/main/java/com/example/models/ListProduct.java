package com.example.models;

import java.util.ArrayList;

public class ListProduct {
    private ArrayList<Product> products;

    public ListProduct() {
        products=new ArrayList<>();
    }
    public void addProduct(Product p)
    {
        products.add(p);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void generate_sample_dataset()
    {
        products.add(new Product(1, "Coca Cola", 10, 12000, 2));          // Drink
        products.add(new Product(2, "Pepsi", 12, 11500, 2));              // Drink
        products.add(new Product(3, "Orange Juice", 8, 18000, 2));        // Drink
        products.add(new Product(4, "Mineral Water", 20, 10000, 2));      // Drink

        products.add(new Product(5, "Dog Food", 5, 45000, 1));            // Food
        products.add(new Product(6, "Cat Food", 6, 42000, 1));            // Food
        products.add(new Product(7, "Bird Seeds", 15, 35000, 1));         // Food
        products.add(new Product(8, "Fish Flakes", 10, 30000, 1));        // Food

        products.add(new Product(9, "Rubber Ball", 25, 15000, 3));        // Toys
        products.add(new Product(10, "Chew Toy", 18, 25000, 3));          // Toys
        products.add(new Product(11, "Cat Teaser", 20, 28000, 3));        // Toys
        products.add(new Product(12, "Squeaky Toy", 22, 23000, 3));       // Toys

        products.add(new Product(13, "Pet Collar", 15, 30000, 4));        // Accessories
        products.add(new Product(14, "Pet Leash", 10, 35000, 4));         // Accessories
        products.add(new Product(15, "Pet Bowl", 12, 25000, 4));          // Accessories
        products.add(new Product(16, "Pet Bed", 6, 70000, 4));            // Accessories

        products.add(new Product(17, "Vitamin Supplement", 8, 50000, 5)); // Healthcare
        products.add(new Product(18, "Flea Spray", 7, 65000, 5));         // Healthcare
        products.add(new Product(19, "Wound Cleaner", 5, 55000, 5));      // Healthcare
        products.add(new Product(20, "Dental Chews", 10, 40000, 5));      // Healthcare
    }
}
