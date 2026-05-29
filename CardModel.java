package com.example.recyclerviewassignment.Models;

public class CardModel {
    int img;
    String name;
    String role;

    public CardModel(int img, String name, String role) {
        this.img = img;
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public int getImg(){
        return img;
    }
}
