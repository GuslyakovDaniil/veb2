package com.app.controllers;

import com.app.dtos.RolesDto;
import com.app.services.RolesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolesController {
    private final RolesService<Integer> rolesService;

    public RolesController(RolesService<Integer> rolesService) {
        this.rolesService = rolesService;
    }

    @PostMapping("/register")
    public ResponseEntity<RolesDto> registerRoles(@RequestBody RolesDto rolesDto) {
        RolesDto registeredRoles = rolesService.registerRoles(rolesDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredRoles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolesDto> getRolesById(@PathVariable Integer id) {
        return rolesService.findRoles(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<RolesDto>> getAllRoles() {
        List<RolesDto> allRoles = rolesService.getAll();
        return ResponseEntity.ok(allRoles);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoles(@PathVariable Integer id) {
        rolesService.expelRoles(id);
        return ResponseEntity.noContent().build();
    }
}
