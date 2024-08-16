package com.ashmit.SpringBootLearn.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {


    private int prodId;
    private String prodName;
    private int price;

    public Product() {
    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return this.prodId;
    }

    public String getProdName() {
        return this.prodName;
    }

    public int getPrice() {
        return this.price;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

       public String toString() {
        return "Product(prodId=" + this.getProdId() + ", prodName=" + this.getProdName() + ", price=" + this.getPrice() + ")";
    }
}
