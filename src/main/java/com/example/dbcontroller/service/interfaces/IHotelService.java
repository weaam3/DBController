package com.example.dbcontroller.service.interfaces;


import com.example.dbcontroller.model.Hotel;

import java.util.List;

public interface IHotelService {
    List<Hotel> getAllHotels();

    List<Hotel> getAllHotelsBasedOnTheCountry(long countryId);

    List<Hotel> getAllHotelsByManagerId(long managerId);
    Hotel save(Hotel hotel);
    Hotel getHotelByHotelIdAndManagerId(long hotelId, long managerId);
    Hotel update(Hotel hotel);
    Hotel deleteByIdAndManagerID(long hotelId, long managerId);
    Hotel getHotelById(long hotelId);
}
