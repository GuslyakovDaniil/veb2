package com.app.repositories;

import com.app.models.Brands;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandsRepository extends JpaRepository<Brands,Integer> {
}
