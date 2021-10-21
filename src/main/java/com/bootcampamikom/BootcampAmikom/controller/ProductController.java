/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcampamikom.BootcampAmikom.controller;

import com.bootcampamikom.BootcampAmikom.entity.Product;
import com.bootcampamikom.BootcampAmikom.service.ProductImplement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lenovo
 */
@Controller
public class ProductController {
    @Autowired
    private ProductImplement productImplement;
    
    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Product> listProduct = productImplement.getProducts();
        model.addAttribute("listProduct",listProduct);
        
       return "index";
    }
    
    @RequestMapping("/new")
    public String showNewProductPage(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        
        return "new_product";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product)
    {
        productImplement.save(product);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditPage(@PathVariable(name="id") Long id){
        ModelAndView modelAndView = new ModelAndView("edit_product");
        Product product = productImplement.getById( id);
        
        modelAndView.addObject("product", product);
        return modelAndView;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name="id") Long id){
        productImplement.delete(id);
        return "redirect:/";
    }
}
