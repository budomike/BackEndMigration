package com.example.demo.services;


import com.example.demo.entity.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
public class Purchase {

    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;

}
