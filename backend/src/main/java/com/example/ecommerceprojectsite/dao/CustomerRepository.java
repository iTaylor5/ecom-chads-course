package com.example.ecommerceprojectsite.dao;

import com.example.ecommerceprojectsite.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository< Customer, Long> {

    Customer findByEmail(String theEmail); // SELECT * FROM customer c WHERE c.email=theEmail;

}
