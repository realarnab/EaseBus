package com.EaseBus.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

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

}
