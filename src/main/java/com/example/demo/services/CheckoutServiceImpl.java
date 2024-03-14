package com.example.demo.services;

import com.example.demo.dao.*;
import com.example.demo.entity.*;
import jakarta.annotation.*;
import jakarta.transaction.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class CheckoutServiceImpl implements CheckoutService{
    private CustomerRepository customerRepository;
    @Resource
    private CartRepository cartRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Cart cart = purchase.getCart();

        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> item.setCart(cart));

        if (cartItems.size() > 0){
            String orderTrackingNumber = generateOrderTrackingNumber();
            cart.setOrderTrackingNumber(orderTrackingNumber);
        cart.setCartItems(cartItems);
        cart.setStatus(StatusType.ordered);
        cartRepository.save(cart);
        return new PurchaseResponse(orderTrackingNumber);}
        else {
            return new PurchaseResponse("Error: No items in cart.");
        }

    }

    private String generateOrderTrackingNumber() {

        return UUID.randomUUID().toString();

    }
}
