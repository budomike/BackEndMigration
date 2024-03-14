package com.example.demo.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.*;

import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name="excursions")
@Getter
@Setter
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;
    @Column(name = "excursion_title")
    private String excursion_title;
    @Column(name = "excursion_price")
    private BigDecimal excursion_price;
    @Column(name = "image_URL")
    private String image_URL;
    @CreationTimestamp
    @Column(name = "create_date")
    private Date create_date;
    @UpdateTimestamp
    @Column(name = "last_update")
    private Date last_update;
    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "excursions")
    private Set<CartItem> cartItems = new HashSet<>();
}
