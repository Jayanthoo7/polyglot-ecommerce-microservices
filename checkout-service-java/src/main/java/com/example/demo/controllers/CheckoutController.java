package com.example.demo.controllers;

import com.example.demo.models.Order;
import com.example.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
@CrossOrigin
public class CheckoutController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/process")
    public Order processCheckout(@RequestBody Order order) {
        // Set the status to COMPLETED before saving
        order.setStatus("COMPLETED");
        return orderRepository.save(order);
    }

    @GetMapping("/test")
    public String test() {
        return "Java Checkout Service is UP and the Controller is working!";
    }
}