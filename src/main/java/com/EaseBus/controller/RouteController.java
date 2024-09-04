package com.EaseBus.controller;

import com.EaseBus.exceptions.RouteNotFoundException;
import com.EaseBus.model.Route;
import com.EaseBus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping()
    public ResponseEntity<?> getAllRoute(){
        List<Route> all = routeService.getAll();
        return new ResponseEntity<>(all,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{routeId}")
    public ResponseEntity<?> deleteRoute(@PathVariable int routeId) throws RouteNotFoundException {
        routeService.deleteRouteById(routeId);
        return new ResponseEntity<>("Route deleted successfully",HttpStatus.OK);
    }
    @PutMapping("/update/{routeId}")
    public ResponseEntity<?> updateRoute(@PathVariable Integer routeId,@RequestBody Route route){
        routeService.updateRouteById(routeId);
    }
}
