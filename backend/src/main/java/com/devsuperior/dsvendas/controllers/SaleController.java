/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.dtos.SaleSucessDTO;
import com.devsuperior.dsvendas.dtos.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elisson
 */
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }
    
    @GetMapping(value = "/group1")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedbySeller() {
        List<SaleSumDTO> list = service.amountGroupedbySeller();
        return ResponseEntity.ok(list);
    }
    
    @GetMapping(value = "/group2")
    public ResponseEntity<List<SaleSucessDTO>> sucessGroupedbySeller() {
        List<SaleSucessDTO> list = service.sucessGroupedbySeller();
        return ResponseEntity.ok(list);
    }
    
    
}
