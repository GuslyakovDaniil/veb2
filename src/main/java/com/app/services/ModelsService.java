package com.app.services;

import com.app.dtos.ModelsDto;
import java.util.List;
import java.util.Optional;

public interface ModelsService <ID> {
    ModelsDto registerModels(ModelsDto models);

    void expelModels(ModelsDto models);

    void expelModels(ID id);

    Optional<ModelsDto> findModels(ID id);

    List<ModelsDto> getAll();
}
