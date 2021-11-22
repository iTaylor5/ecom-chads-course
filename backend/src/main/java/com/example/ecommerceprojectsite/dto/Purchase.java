package com.example.ecommerceprojectsite.dto;

import com.example.ecommerceprojectsite.entities.Address;
import com.example.ecommerceprojectsite.entities.Customer;
import com.example.ecommerceprojectsite.entities.Order;
import com.example.ecommerceprojectsite.entities.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
