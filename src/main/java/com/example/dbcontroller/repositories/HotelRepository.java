package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> getHotelByCountryId(long countryId);

    List<Hotel> getHotelByManagerId(long managerId);

    Hotel getHotelByIdAndManagerId(long id, long managerId);

    Integer deleteHotelByIdAndManagerId(long id, long managerId);

    Hotel findHotelById(long id);
}
