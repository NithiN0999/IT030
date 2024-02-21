package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Restaurant;
import com.example.demo.repository.RestaurantRepo;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public Restaurant addRestaurant(Restaurant restaurant)
    {
        return restaurantRepo.save(restaurant);
    }
    public List<Restaurant> getRestaurantDetails()
    {
        return restaurantRepo.findAll();
    }
    public Optional<Restaurant> f1(Long restaurantId)
    {
        return restaurantRepo.findById(restaurantId);
    }
    public String deleteRestaurant(Long id)
    {
       restaurantRepo.deleteById(id);
        return(" Successfully Deleted");
    }
    public Restaurant editRestaurant(Long id,Restaurant restaurant)
     {
       Restaurant RestaurantAvail = restaurantRepo.findById(id).orElse(null);
         if(RestaurantAvail !=null)
         {    
          RestaurantAvail.setRestaurantName(restaurant.getRestaurantName());
          RestaurantAvail.setRestaurantRatings(restaurant.getRestaurantRatings());
          RestaurantAvail.setRestaurantmenu(restaurant.getRestaurantmenu());
          RestaurantAvail.setPaymentDetails(restaurant.getPaymentDetails());
          return restaurantRepo.saveAndFlush(RestaurantAvail);
         }
         else
         return null;
     }
 }