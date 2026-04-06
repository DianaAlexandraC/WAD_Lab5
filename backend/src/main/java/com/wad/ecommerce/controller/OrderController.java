package com.wad.ecommerce.controller;

import com.wad.ecommerce.dto.OrderItemDto;
import com.wad.ecommerce.dto.CheckoutRequest;
import com.wad.ecommerce.model.Order;
import com.wad.ecommerce.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    /* TODO 5-1: POST /api/orders/checkout
   - get username from JWT via @AuthenticationPrincipal UserDetails
   - receive cart items and totalPrice from @RequestBody CheckoutRequest
   - save order to database using orderRepository
   - return ResponseEntity.ok(...)
        Then go to order.service.js */
    

    

    /* TODO 6-1: GET /api/orders. Then go to order.service.js */

    
}