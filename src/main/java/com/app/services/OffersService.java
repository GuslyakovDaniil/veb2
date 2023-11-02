package com.app.services;

import com.app.dtos.OffersDto;
import java.util.List;
import java.util.Optional;

public interface OffersService <ID> {
    OffersDto registerOffers(OffersDto offers);

    void expelOffers(OffersDto offers);

    void expelOffers(ID id);

    Optional<OffersDto> findOffers(ID id);

    List<OffersDto> getAll();
}