package com.example.addrestaurantfragment;

public class Product {
    private String tittle;
    private String description;
    private String price;

    public Product() {
    }

    public Product(String tittle, String description, String price) {
        this.tittle = tittle;
        this.description = description;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
