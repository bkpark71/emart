package com.example.emart.controller;

import com.example.emart.entity.Products;
import com.example.emart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
  private final ProductService productService;

  // 상품 전체 리스트 조회
  @GetMapping("/all")
  public List<Products> getAllProductsList() {
    return productService.getAllProductsList();
  }

  // 특정 상품 상세보기
  @GetMapping("/{id}")
  public Products getProductDetail(@PathVariable Long id) {
    return productService.getProductDetail(id);
  }

  // 상품명 검색 결과 리스트 조회
  @GetMapping("/search")
  public List<Products> getProductSearchList(@RequestParam String q) {
    return productService.getProductSearchList(q);
  }
}