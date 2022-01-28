package com.sparta.vhsstorewebsite.services;

import com.sparta.vhsstorewebsite.entities.FilmEntity;
import com.sparta.vhsstorewebsite.entities.RentedFilmEntity;
import com.sparta.vhsstorewebsite.entities.ReservedFilmEntity;

import java.util.Optional;

public class FilmService {

    public ReservedFilmEntity convertToReservation(FilmEntity filmEntity){
        ReservedFilmEntity reservedFilmEntity = new ReservedFilmEntity(filmEntity.getFilmId(),
                filmEntity.getTitle(), filmEntity.getDescription(), filmEntity.getReleaseYear(),
                filmEntity.getLanguageId(), filmEntity.getRentalDuration(), filmEntity.getRentalRate(),
                filmEntity.getLength(), filmEntity.getReplacementCost(), filmEntity.getRating(), filmEntity.getSpecialFeatures(),
                filmEntity.getLastUpdate());
        return reservedFilmEntity;
    }

    public RentedFilmEntity convertToRented(FilmEntity filmEntity){
        RentedFilmEntity rentedFilmEntity = new RentedFilmEntity(filmEntity.getFilmId(),
                filmEntity.getTitle(), filmEntity.getDescription(), filmEntity.getReleaseYear(),
                filmEntity.getLanguageId(), filmEntity.getRentalDuration(), filmEntity.getRentalRate(),
                filmEntity.getLength(), filmEntity.getReplacementCost(), filmEntity.getRating(), filmEntity.getSpecialFeatures(),
                filmEntity.getLastUpdate());
        return rentedFilmEntity;
    }

}
