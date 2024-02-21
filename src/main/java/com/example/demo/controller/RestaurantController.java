package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Restaurant;
import com.example.demo.service.RestaurantService;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("/api/restaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
    {
          return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("api/restaurant")
    public List<Restaurant> getRestaurantDetails()
    {
        return restaurantService.getRestaurantDetails();
    }
    @GetMapping("/api/restaurant/{restaurantId}")
    public Optional<Restaurant> f1 (@PathVariable Long restaurantId)
    {
        return restaurantService.f1(restaurantId);
    }
     @DeleteMapping("/api/restaurant/{id}")
    public String deleteRestaurant(@PathVariable Long id)
    {
        return restaurantService.deleteRestaurant(id);
    }
    @PutMapping("/api/restaurant/{id}")
    public Restaurant editRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
            
        return restaurantService.editRestaurant(id,restaurant);
    }

}