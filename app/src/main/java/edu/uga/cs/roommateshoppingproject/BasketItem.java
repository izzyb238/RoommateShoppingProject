package edu.uga.cs.roommateshoppingproject;

public class BasketItem {

    private String id;
    private String name;
    private int quantity;

    public BasketItem() { }

    public BasketItem(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity; //quantity should be a integer
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}