package com.ust.inv.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ust.inv.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}