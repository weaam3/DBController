package com.example.dbcontroller.service.interfaces;


import com.example.dbcontroller.model.Room;

import java.util.List;

public interface IRoomService {
    List<Room> getRoomsByHotelId(long hotelId);

    List<Room> getRoomsByCountryAndRoomTypeIds(long countryId, long roomTypeId);

    List<Room> getAllByHotelId(int hotelId);

    public Room save(Room room);
    Room getById(long roomId);

    Room update(Room room);

    Room delete(long roomId);
}
