package com.ashmit.SpringBootLearn.Controller;

import com.ashmit.SpringBootLearn.Model.Product;
import com.ashmit.SpringBootLearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

@Autowired
ProductService service;

@RequestMapping("/products")
public List<Product> getProducts(){
    return service.getProducts();
}

@RequestMapping("/products/{prodId}")
public Product getProductById(@PathVariable int prodId){
    return getProductById(prodId);
}



//@RequestMapping(value = "/products",method = RequestMethod.DELETE)
@PostMapping("/pppp")
public void addProduct(@RequestBody Product prod){
    System.out.println("Helllo");
}
}





//@RestController
//public class ProductController{
//
//    Product service;
//@RequestMapping("/products")
//public List<Product> getProducts(){
//    return service.getProducts();
//}
//
//@RequestMapping("/products/{prodId}")
//public Product getProductById(@PathVariable int prodId){
//    return getProductById(prodId);
//}
//
//@PostMapping("/products")
//public void addProduct(Product prod){
//    service.addProduct(prod);
//}
//}
//We can use GetMapping instead of @RequestMapping
