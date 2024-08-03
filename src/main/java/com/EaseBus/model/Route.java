package com.EaseBus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer routeId;
    @Column(name = "route_from")
    private String routeFrom;
    @Column(name = "route_to")
    private String routeTo;
    @NotNull(message = "distance can not be null")
    private double distance;

    @JsonIgnore
    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<Bus> bus=new ArrayList<>();

}
