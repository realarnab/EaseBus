package com.EaseBus.controller;

import com.EaseBus.model.Route;
import com.EaseBus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/routes")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @PostMapping("/add")
    public ResponseEntity<?> addRoute(@RequestBody Route route){
        Route newRoute = routeService.addNewRoute(route);
        return new ResponseEntity<>(newRoute, HttpStatus.CREATED);
    }
}
