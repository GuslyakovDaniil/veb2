package com.app.services.impl;

import com.app.dtos.RolesDto;
import com.app.models.Roles;
import com.app.repositories.RolesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.services.RolesService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService<Integer> {
    @Autowired
    private RolesRepository rolesRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RolesDto registerRoles(RolesDto roles) {
        Roles newRoles = modelMapper.map(roles, Roles.class);
        return modelMapper.map(rolesRepository.save(newRoles), RolesDto.class);
    }

    @Override
    public void expelRoles(RolesDto roles) {
        rolesRepository.deleteById(roles.getId());
    }

    @Override
    public void expelRoles(Integer id) {
        rolesRepository.deleteById(id);
    }

    @Override
    public Optional<RolesDto> findRoles(Integer id) {
        Optional<Roles> modelsOptional = rolesRepository.findById(id);
        return modelsOptional.map(roles -> modelMapper.map(roles, RolesDto.class));
    }

    @Override
    public List<RolesDto> getAll() {
        return rolesRepository.findAll().stream().map(roles -> modelMapper.map(roles, RolesDto.class)).collect(Collectors.toList());
    }
}
