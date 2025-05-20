package com.example.models;

import java.util.ArrayList;

public class ListCategory {
    private ArrayList<Category> categories;

    public ListCategory() {
        categories=new ArrayList<>();
    }
    public void addCategory(Category ca)
    {
        categories.add(ca);
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
    public void generate_sample_dataset()
    {
        categories.add(new Category(1, "Food"));
        categories.add(new Category(2, "Drink"));
        categories.add(new Category(3, "Toys"));
        categories.add(new Category(4, "Accessories"));
        categories.add(new Category(5, "Healthcare"));
    }
}
