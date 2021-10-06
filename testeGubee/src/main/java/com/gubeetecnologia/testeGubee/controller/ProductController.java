package com.gubeetecnologia.testeGubee.controller;

import com.gubeetecnologia.testeGubee.model.Product;
import com.gubeetecnologia.testeGubee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView getProducts(){
        ModelAndView mv = new ModelAndView("products");
        List<Product> products = productService.findAll();
        mv.addObject("products", products);
        return mv;
    }

    @PostMapping("/search-by-target-market")
    public ModelAndView filterTargetMarket(@RequestParam("searchbytargetmarket") String searchbytargetmarket) {
        ModelAndView mv = new ModelAndView("/search-by-target-market");
        mv.addObject("products", productService.findByTargetMarket(searchbytargetmarket));
        return mv;
    }



    @PostMapping("/search-by-stack")
    public ModelAndView filterStack(@RequestParam("searchbystack") String searchbystack) {
        ModelAndView mv = new ModelAndView("/search-by-stack");
        mv.addObject("products", productService.findByStack(searchbystack));
        return mv;
    }


    @GetMapping(value = "/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable String id) {
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}

