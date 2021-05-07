/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.dtos;

import com.devsuperior.dsvendas.entities.Seller;
import java.io.Serializable;

/**
 *
 * @author elisson
 */
public class SaleSumDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String sellerName;
    private Double sum;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double sum) {
        sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
    
    
}
