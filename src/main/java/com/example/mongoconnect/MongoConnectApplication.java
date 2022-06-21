package com.example.mongoconnect;

import com.example.mongoconnect.model.GroceryItem;
import com.example.mongoconnect.repository.IGroceryItem;
import com.example.mongoconnect.utils.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableMongoRepositories
public class MongoConnectApplication {

	@Autowired
	private IGroceryItem groceryItem;

	public static void main(String[] args) {
		SpringApplication.run(MongoConnectApplication.class, args);

	}

	public void createGroceryItems() {
		System.out.println("Data creation started...");
		groceryItem.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
		groceryItem.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
		groceryItem.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
		groceryItem.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
		groceryItem.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
		System.out.println("Data creation complete...");
	}

	@PostConstruct
	public void init() {
		System.out.println("Initalized Application");
		createGroceryItems();
	}

}
