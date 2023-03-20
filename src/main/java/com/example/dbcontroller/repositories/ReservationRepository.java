package com.example.dbcontroller.repositories;

import com.example.dbcontroller.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findAllByUserId(long userId);

    Reservation getReservationById(long id);

    List<Reservation> findAllByRoomId(long roomId);
}
