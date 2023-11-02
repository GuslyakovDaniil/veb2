package com.app.services;

import com.app.dtos.BrandsDto;

import java.util.List;
import java.util.Optional;

public interface BrandsServices<ID> {
    BrandsDto registerBrands(BrandsDto brands);
    void expelBrands(BrandsDto brands);
    void expelBrands(ID id);
    Optional<BrandsDto> findBrands(ID id);
    List<BrandsDto> getAll();
}

