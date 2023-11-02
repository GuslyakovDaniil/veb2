package com.app.controllers;

import com.app.dtos.UsersDto;
import com.app.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersService<Integer> usersService;

    public UsersController(UsersService<Integer> usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/register")
    public ResponseEntity<UsersDto> registerUsers(@RequestBody UsersDto usersDto) {
        UsersDto registeredUsers = usersService.registerUsers(usersDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredUsers);
    }


    @GetMapping("/{id}")
    public ResponseEntity<UsersDto> getUsersById(@PathVariable Integer id) {
        return usersService.findUsers(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<UsersDto>> getAllUsers() {
        List<UsersDto> allUsers = usersService.getAll();
        return ResponseEntity.ok(allUsers);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsers(@PathVariable Integer id) {
        usersService.expelUsers(id);
        return ResponseEntity.noContent().build();
    }
}
