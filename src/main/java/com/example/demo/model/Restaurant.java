package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RestaurantManagement")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long restaurantId;
    String restaurantName;
    String restaurantRatings;
    String restaurantmenu;
    String paymentDetails;
    public Long getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
    public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public String getRestaurantRatings() {
        return restaurantRatings;
    }
    public void setRestaurantRatings(String restaurantRatings) {
        this.restaurantRatings = restaurantRatings;
    }
    public String getRestaurantmenu() {
        return restaurantmenu;
    }
    public void setRestaurantmenu(String restaurantmenu) {
        this.restaurantmenu = restaurantmenu;
    }
    public String getPaymentDetails() {
        return paymentDetails;
    }
    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}