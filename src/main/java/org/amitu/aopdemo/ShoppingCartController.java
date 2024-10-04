package org.amitu.aopdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    @GetMapping("/checkout/{status}")
    public String checkout(@PathVariable("status") String status){
        System.out.println("Inside checkout method");
        return "Checking out with status "+status;
    }

    @GetMapping("/get/quantity")
    public int getQuantity(){
        return 2;
    }
}
