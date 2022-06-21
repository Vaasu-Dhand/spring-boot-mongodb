package com.example.mongoconnect.utils;

import com.example.mongoconnect.model.GroceryItem;
import com.example.mongoconnect.repository.IGroceryItem;
import org.springframework.beans.factory.annotation.Autowired;

public class Operations {

    @Autowired
    private IGroceryItem groceryItem;

    public void createGroceryItems() {
        System.out.println("Data creation started...");
        groceryItem.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
        groceryItem.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
        groceryItem.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
        groceryItem.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
        groceryItem.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
        System.out.println("Data creation complete...");
    }
}
