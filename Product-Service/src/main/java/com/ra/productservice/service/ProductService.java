package com.ra.productservice.service;

import com.ra.productservice.dto.request.ProductRequestDTO;
import com.ra.productservice.dto.response.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO request);
    ProductResponseDTO getProductById(Long id);
    List<ProductResponseDTO> getAllProducts();
}