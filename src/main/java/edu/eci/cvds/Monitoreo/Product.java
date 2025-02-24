package edu.eci.cvds.Monitoreo;

public class Product {

    private String name;
    private int price;
    private int stock;
    private String category;

    public Product(String name, int price, int stock, String category){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public Product(){
    }

    public void updateProduct(String name, int price, int stock, String category){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // Getters & Setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void removeStock(int stock){
        this.stock = stock - 1;
    }
}
