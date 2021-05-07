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
public class SaleSucessDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSucessDTO() {
    }

    public SaleSucessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    
    
    
}
