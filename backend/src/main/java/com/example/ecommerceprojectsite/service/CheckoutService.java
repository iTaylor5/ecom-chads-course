package com.example.ecommerceprojectsite.service;

import com.example.ecommerceprojectsite.dto.Purchase;
import com.example.ecommerceprojectsite.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);


}
