package com.berko.foodtruck.web;

import static spark.Spark.*;
import com.berko.foodtruck.repository.FoodTruckRepository;

public class Controller {

	private static FoodTruckRepository repo = new FoodTruckRepository();
	
	public static void main(String[] args) {
        get("/events", (req, res) -> {
        	String result = repo.getCheckins();
        	return result;
        });
    }
}
