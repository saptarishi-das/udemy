package com.tutorials.springbootjpa.repository;

import java.util.List;
import com.tutorials.springbootjpa.model.ProductQRDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductQRDetailsRepository extends JpaRepository<ProductQRDetails, String>{
    // ProductQRDetails findProductByQRCode(String qrCode);
    List<ProductQRDetails> productNameContaining(String productName); 
}
