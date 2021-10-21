/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcampamikom.BootcampAmikom.repository;

import com.bootcampamikom.BootcampAmikom.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
