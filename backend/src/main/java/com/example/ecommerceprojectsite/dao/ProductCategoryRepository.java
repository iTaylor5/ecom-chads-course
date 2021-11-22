package com.example.ecommerceprojectsite.dao;

import com.example.ecommerceprojectsite.entities.ProductCategory;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

// productCategory will be the Name of thee JSON entry
// /product-category will the path
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
