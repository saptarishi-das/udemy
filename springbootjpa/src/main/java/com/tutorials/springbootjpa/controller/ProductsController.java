package com.tutorials.springbootjpa.controller;

import java.util.List;

import com.tutorials.springbootjpa.model.ProductQRDetails;
import com.tutorials.springbootjpa.repository.ProductQRDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductsController {
    @Autowired
    ProductQRDetailsRepository productsRepository;

    @GetMapping("/find/qrcode")
    public ProductQRDetails getProductByQRCode(@RequestParam String qrCode) {
        return productsRepository.findById(qrCode).get();
    }

    @GetMapping("/find/productnameslike")
    public List<ProductQRDetails> getProductsContaining(@RequestParam String productName) {
        return productsRepository.productNameContaining(productName);
    }
}
