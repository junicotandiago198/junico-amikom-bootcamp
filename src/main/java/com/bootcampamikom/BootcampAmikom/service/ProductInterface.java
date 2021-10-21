/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcampamikom.BootcampAmikom.service;

import com.bootcampamikom.BootcampAmikom.entity.Product;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface ProductInterface {
    List<Product> getProducts();
    void save(Product product);
    Product getById(Long id);
    void delete(Long id);
}
