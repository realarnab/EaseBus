package com.EaseBus.service;

import com.EaseBus.model.Bus;

import java.util.List;

public interface BusService {

    Bus addNewBus(Bus bus);

    List<Bus> getAllBuses();

    Bus getById(int busId);
}
