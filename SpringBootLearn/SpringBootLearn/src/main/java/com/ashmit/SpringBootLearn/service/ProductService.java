package com.ashmit.SpringBootLearn.service;

import com.ashmit.SpringBootLearn.Model.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;
import  java.util.*;

@Component
public class ProductService {
    List<Product> product=new ArrayList<>( Arrays.asList(
            new Product(101 ,"Iphone",60000),
            new Product(102,"Samsung",40000),
            new Product(103,"Moto",3900)));
    public List<Product> getProducts(){
        return product;
    }
    public Product getProductById(int prodId){
       return product.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(100,"No Item",00));
    }

    public void addProduct(@RequestBody Product prod){
        product.add(prod);
    }
}
