package com.app.controllers;

import com.app.dtos.OffersDto;
import com.app.services.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/info")
public class DataInputController {
    private final OffersService offersService;

    @Autowired
    public DataInputController(OffersService offersService) {
        this.offersService = offersService;
    }

    @GetMapping("/data-input")
    public String dataInputForm() {
        return "data-input";
    }

    @GetMapping("/add-offer")
    public String addOffer(@RequestParam String description, @RequestParam double price) {
        OffersDto offersDto = new OffersDto();
        offersDto.setDescription(description);
        offersDto.setPrice(BigDecimal.valueOf(price)); // Convert double to BigDecimal

        offersService.registerOffers(offersDto);

        return "redirect:/home";
    }


}

