package com.EaseBus.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.antlr.v4.runtime.misc.NotNull;
import org.aspectj.bridge.IMessage;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "buses")
@Data
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private int busId;

    @Column(name = "bus_name",nullable = false)
    private String busName;
    @Column(name = "driver_name",nullable = false)
    private String driverName;
    @Column(name = "bus_type")
    private String busType;
    @Column(name = "bus_reg_no",nullable = false)
    private String busRegNo;
    @Column(name = "route_from")
    private String routeFrom;
    @Column(name = "route_to")
    private String routeTo;
    @Column(name = "arrival_time",nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime arrivalTime;
    @Column(name = "departure_time",nullable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalTime departureTime;
    @Column(nullable = false)
    private Integer seats;
    @Column(name = "available_seats",nullable = false)
    private Integer availableSeats;
    @Column(name = "fare_per_seat",nullable = false)
    private Integer farePerSeat;
    @Column(name = "bus_journey_date",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd") //define the format of the date
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)//set the time as per indian standard time
    private LocalDate busJourneyDate;

}
