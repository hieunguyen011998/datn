package com.example.datn.Object;

import java.util.Date;

public class Drink {
    public int id;
    public String name;
    public String imageUri;
    public int amount;
    public float price;
    public String type;
    public Date dateCreate;

    public Drink(int id, String name, String imageUri, int amount, float price, String type, Date dateCreate) {
        this.id = id;
        this.name = name;
        this.imageUri = imageUri;
        this.amount = amount;
        this.price = price;
        this.type = type;
        this.dateCreate = dateCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }
}
