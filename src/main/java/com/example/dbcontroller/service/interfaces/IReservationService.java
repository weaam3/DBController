package com.example.dbcontroller.service.interfaces;


import com.example.dbcontroller.model.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> getRoomReservationsByUserId(long userId);

    Reservation makeReservation(Reservation reservation);


    List<Reservation> getAllByHotelAndManagerId(long hotelId, long managerId);

    Reservation getByReservationIdAndManagerId(long reservationId, long managerId);

    List<Reservation> getAllByManagerId(long managerId);

    Reservation update(Reservation reservation);

    Reservation delete(long reservationId);
}
