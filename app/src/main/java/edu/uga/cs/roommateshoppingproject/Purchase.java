package edu.uga.cs.roommateshoppingproject;

import java.util.ArrayList;

public class Purchase {

    private String id;
    private String buyerEmail;
    private String date;
    private double totalPrice;
    private ArrayList<BasketItem> items;

    public Purchase(){
        items = new ArrayList<>();
    }

    public Purchase(String id, String buyerEmail, String date, double totalPrice, ArrayList<BasketItem> items) {
        this.id = id;
        this.buyerEmail = buyerEmail;
        this.date = date;
        this.totalPrice = totalPrice;
        this.items = items;
    }

    public String getId() { return id; }
    public void setId(String id) {
        this.id = id;
    }
    public String getBuyerEmail() { return buyerEmail; }
    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getDate() { return date; }

    public void setDate(String date) {
        this.date = date;
    }
    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public ArrayList<BasketItem> getItems() { return items; }

    public void setItems(ArrayList<BasketItem> items) {
        this.items = items;
    }
}