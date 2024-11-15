package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="products")

public class Product {
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;
    private String description;
    private double ratings;
    private String category;
    private String seller;
    private int stock;
    private int numOfReviews;

    @ElementCollection
    @Column(name="image_url")
    private List<String>images;
    public List<String> getImages(){
        return images;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public Product(){

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getRatings() {
        return ratings;
    }

    public String getCategory() {
        return category;
    }

    public String getSeller() {
        return seller;
    }

    public int getStock() {
        return stock;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public Product(String name, double price, String description, double ratings, String category, String seller, int stock, int numOfReviews, List<String> images) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.ratings = ratings;
        this.category = category;
        this.seller = seller;
        this.stock = stock;
        this.numOfReviews = numOfReviews;
        this.images = images;
    }
}
