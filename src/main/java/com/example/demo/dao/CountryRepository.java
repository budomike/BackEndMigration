package com.example.demo.dao;


import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Long> {

}