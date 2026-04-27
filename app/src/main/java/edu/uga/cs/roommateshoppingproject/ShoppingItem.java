package edu.uga.cs.roommateshoppingproject;

/**
 * items that are saved in the database, shopping items
 * ex) eggs, boolean value to determine if they are purchased
 */
public class ShoppingItem {
    private String id;
    private String name;
    private int quantity;
    private int price;
    private boolean isPurchased;

    public ShoppingItem() { }

    public ShoppingItem(String id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity; //quantity should be a integer
        this.isPurchased = false;
        this.price = price;
    }

    public ShoppingItem(String name, int quantity, int price) {
        this.id = "1";
        this.name = name;
        this.quantity = quantity; //quantity should be a integer
        this.price = price;
        this.isPurchased = false;
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

    public boolean getIsPurchased() {return isPurchased;}
    public void markAsPurchased() {this.isPurchased = !this.isPurchased;}

    public int getPrice() {return price;}
    public void setPrice(int price){this.price = price;}

}
