package com.example.dbcontroller.service.interfaces;

import com.example.dbcontroller.model.RoomType;

import java.util.List;

public interface IRoomTypeService {
    List<RoomType> getAllRoomTypes();

    List<RoomType> getAllRoomTypesByHotelID(int hotelIds);

    RoomType getRoomTypeById(int roomTypeId);
}
