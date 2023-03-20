package com.example.dbcontroller.service.implementation;

import com.example.dbcontroller.model.Hotel;
import com.example.dbcontroller.model.Room;
import com.example.dbcontroller.repositories.HotelRepository;
import com.example.dbcontroller.repositories.RoomRepository;
import com.example.dbcontroller.service.interfaces.IRoomService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService {
    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;

    public RoomServiceImpl(RoomRepository roomRepository, HotelRepository hotelRepository) {
        this.roomRepository = roomRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Room> getRoomsByHotelId(long hotelId) {
        return roomRepository.findAllByHotelId(hotelId);
    }

    @Override
    public List<Room> getRoomsByCountryAndRoomTypeIds(long countryId, long roomTypeId) {
        List<Hotel> hotels = hotelRepository.getHotelByCountryId(countryId);
        List<Room> rooms = new ArrayList<>();
        for (Hotel hotel : hotels) {
            rooms.addAll(roomRepository.findAllByTypeIdAndHotelId(roomTypeId, hotel.getId()));
        }
        return rooms;
    }

    @Override
    public List<Room> getAllByHotelId(int hotelId) {
        return roomRepository.findAllByHotelId(hotelId);
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room getById(long roomId) {
        return roomRepository.findRoomById(roomId);
    }

    @Override
    public Room update(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room delete(long roomId) {
        roomRepository.deleteById(roomId);
        return new Room();
    }
}
