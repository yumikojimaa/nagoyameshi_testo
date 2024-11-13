package com.example.nagoyameshi.entity;

 import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;
 
 @Entity
 @Table(name = "restaurants")
 @Data
public class Restaurant {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Integer id;
 
     @Column(name = "name")
     private String name;
 
     @Column(name = "image_name")
     private String imageName;
 
     @Column(name = "description")
     private String description;
 
     @Column(name = "lowest_price")
     private Integer lowestPrice;
     
     @Column(name = "highest_price")
     private Integer highestPrice;
     
     @Column(name = "postal_code")
     private String postalCode;
     
     @Column(name = "address")
     private String address;
     
     @Column(name = "regular_holiday")
     private String regularHoliday;
     
     @Column(name = "opening_time")
     private String openingTime;
     
     @Column(name = "seating_capacity")
     private Integer seatingCapacity;

     @ManyToOne
     @JoinColumn(name = "category_id")
     private Category category;
 
     @Column(name = "created_at", insertable = false, updatable = false)
     private Timestamp createdAt;
 
     @Column(name = "updated_at", insertable = false, updatable = false)
     private Timestamp updatedAt;
}
