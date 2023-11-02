package com.app.services.impl;

import com.app.dtos.ModelsDto;
import com.app.models.Brands;
import com.app.models.Models;
import com.app.repositories.BrandsRepository;
import com.app.repositories.ModelsRepository;
import org.springframework.stereotype.Service;
import com.app.services.ModelsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModelsServiceImpl implements ModelsService<Integer> {
    @Autowired
    private ModelsRepository modelsRepository;

    @Autowired
    private BrandsRepository brandsRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ModelsDto registerModels(ModelsDto models) {
        Models newModel = modelMapper.map(models, Models.class);

        Brands brand = brandsRepository.findById(models.getBrandId())
                .orElseThrow(() -> new IllegalArgumentException("Не было найдено id брэнда: " + models.getBrandId()));

        newModel.setBrand(brand);

        Date now = new Date();
        newModel.setCreated(now);
        newModel.setModified(now);

        Models savedModel = modelsRepository.save(newModel);

        return modelMapper.map(savedModel, ModelsDto.class);
    }


    @Override
    public void expelModels(ModelsDto models) {
        modelsRepository.deleteById(models.getId());
    }


    @Override
    public void expelModels(Integer id) {
        modelsRepository.deleteById(id);
    }

    @Override
    public Optional<ModelsDto> findModels(Integer id) {
        Optional<Models> modelsOptional = modelsRepository.findById(id);
        return modelsOptional.map(models -> modelMapper.map(models, ModelsDto.class));
    }

    @Override
    public List<ModelsDto> getAll() {
        return modelsRepository.findAll().stream().map(models -> modelMapper.map(models, ModelsDto.class)).collect(Collectors.toList());
    }
}
