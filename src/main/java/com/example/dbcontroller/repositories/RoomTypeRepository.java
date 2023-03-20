package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
    @Override
    List<RoomType> findAll();

    List<RoomType> findRoomTypesByHotelId(int hotelId);

    RoomType findRoomTypeById(long id);
}
