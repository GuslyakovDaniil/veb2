package com.app.init;

import com.app.dtos.BrandsDto;
import com.app.dtos.ModelsDto;
import com.app.dtos.OffersDto;
import com.app.dtos.RolesDto;
import com.app.dtos.UsersDto;
import com.app.enums.Category;
import com.app.enums.Engine;
import com.app.enums.Role;
import com.app.enums.Transmission;
import com.app.models.Users;
import com.app.services.BrandsServices;
import com.app.services.ModelsService;
import com.app.services.OffersService;
import com.app.services.RolesService;
import com.app.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OffersService<Integer> offersService;
    private final ModelsService<Integer> modelsService;
    private final UsersService<Integer> usersService;
    private final RolesService<Integer> rolesService;
    private final BrandsServices<Integer> brandsService;

    @Autowired
    public DataInitializer(
            OffersService<Integer> offersService,
            ModelsService<Integer> modelsService,
            UsersService<Integer> usersService,
            RolesService<Integer> rolesService,
            BrandsServices<Integer> brandsService
    ) {
        this.offersService = offersService;
        this.modelsService = modelsService;
        this.usersService = usersService;
        this.rolesService = rolesService;
        this.brandsService = brandsService;
    }

    private void seedData() {
        RolesDto rolesDto = new RolesDto(Role.ADMIN);
        rolesService.registerRoles(rolesDto);
        UsersDto usersDto = new UsersDto(true,"car@mail.ru", new Date(), "Sinergia", "URL img", "Lyche", new Date(), "Wseh", "Sinergia_net", 1);
        usersService.registerUsers(usersDto);
        BrandsDto brandsDto = new BrandsDto(new Date(), new Date(),"описание","BMW");
        brandsService.registerBrands(brandsDto);
        ModelsDto modelsDto = new ModelsDto(Category.CAR, new Date(), 2025, "URL img", new Date(), "GT-500", 1945, 1);
        modelsService.registerModels(modelsDto);
        OffersDto offersDto = new OffersDto(new Date(), "Сомнительное предложение", Engine.ELECTRIC, "URL img", 5700, new Date(), BigDecimal.valueOf(6000), Transmission.AUTOMATIC, 2023,1,1);
        offersService.registerOffers(offersDto);
    }

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }
}