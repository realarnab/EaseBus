package com.EaseBus.repository;

import com.EaseBus.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;
@Repository
public interface BusRepository extends JpaRepository<Bus,Integer> {
    @Query("UPDATE Bus b SET " +
            "b.busName = :busName, " +
            "b.driverName = :driverName, " +
            "b.busType = :busType, " +
            "b.busRegNo = :busRegNo, " +
            "b.routeFrom = :routeFrom, " +
            "b.routeTo = :routeTo, " +
            "b.arrivalTime = :arrivalTime, " +
            "b.departureTime = :departureTime, " +
            "b.seats = :seats, " +
            "b.availableSeats = :availableSeats, " +
            "b.farePerSeat = :farePerSeat, " +
            "b.busJourneyDate = :busJourneyDate " +
            "WHERE b.busId = :busId")
    Bus updateBusById(@Param("busId") int busId,
                      @Param("busName") String busName,
                      @Param("driverName") String driverName,
                      @Param("busType") String busType,
                      @Param("busRegNo") String busRegNo,
                      @Param("routeFrom") String routeFrom,
                      @Param("routeTo") String routeTo,
                      @Param("arrivalTime") LocalTime arrivalTime,
                      @Param("departureTime") LocalTime departureTime,
                      @Param("seats") Integer seats,
                      @Param("availableSeats") Integer availableSeats,
                      @Param("farePerSeat") Integer farePerSeat,
                      @Param("busJourneyDate") LocalDate busJourneyDate);

    public Optional<Bus> findByBusName(String busName);

    Optional<Bus> findByBusType(String busType);
}
