package com.app.controllers;

import com.app.dtos.OffersDto;
import com.app.services.OffersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OffersController {
    private final OffersService<Integer> offersService;

    public OffersController(OffersService<Integer> offersService) {
        this.offersService = offersService;
    }

    @PostMapping("/register")
    public ResponseEntity<OffersDto> registerOffers(@RequestBody OffersDto offersDto) {
        OffersDto registeredOffers = offersService.registerOffers(offersDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredOffers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OffersDto> getOffersById(@PathVariable Integer id) {
        return offersService.findOffers(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<OffersDto>> getAllOffers() {
        List<OffersDto> allOffers = offersService.getAll();
        return ResponseEntity.ok(allOffers);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOffers(@PathVariable Integer id) {
        offersService.expelOffers(id);
        return ResponseEntity.noContent().build();
    }
}
