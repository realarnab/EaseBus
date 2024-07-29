package com.EaseBus.service;

import com.EaseBus.model.Bus;

import java.util.List;

public interface BusService {

    Bus addNewBus(Bus bus);

    List<Bus> getAllBuses();

    Bus getById(int busId);

    void deleteBusById(int busId);

    Bus update(int busId, Bus bus);

    Bus getBusByBusName(String busName);

    Bus getBusByType(String busType);
}
