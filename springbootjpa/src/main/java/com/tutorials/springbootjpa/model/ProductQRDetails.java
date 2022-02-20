package com.tutorials.springbootjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_qr_details")
public class ProductQRDetails {

    @Id
    @Column(name = "qr_code")
    private String qrCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity")
    private double quantity = 0;

    protected ProductQRDetails() {

    }

    public ProductQRDetails(String productName, String qrCode, double quantity) {
        this.productName = productName;
        this.qrCode = qrCode;
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
