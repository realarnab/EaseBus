package com.EaseBus.controller;

import com.EaseBus.model.Bus;
import com.EaseBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping("/add")
    public ResponseEntity<?> addBus(@RequestBody Bus bus){
        Bus newBus = busService.addNewBus(bus);
        return new ResponseEntity<>(newBus, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getBuses(){
        List<Bus> allBuses = busService.getAllBuses();
        return new ResponseEntity<>(allBuses,HttpStatus.OK);
    }
}
