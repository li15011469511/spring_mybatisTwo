package com.dj.spring_mybatis.service;

import com.dj.spring_mybatis.domain.Product;

import java.util.List;

public interface ProductService {

    public List<Product> readProduct();


    public void delProduct(Integer id);

    public void updateProduct(Product product);

    public void addProduct(Product product);


}
