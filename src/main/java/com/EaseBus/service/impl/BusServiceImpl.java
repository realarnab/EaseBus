package com.EaseBus.service.impl;

import com.EaseBus.exceptions.BusNotFoundException;
import com.EaseBus.model.Bus;
import com.EaseBus.repository.BusRepository;
import com.EaseBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus addNewBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Bus getById(int busId) {
        return busRepository.findById(busId).orElseThrow(()-> new BusNotFoundException("No Bus Found with id: "+busId));
    }

    @Override
    public void deleteBusById(int busId) {
        Optional<Bus> bus = busRepository.findById(busId);
        if (bus.isPresent()) {
            busRepository.deleteById(busId);
        }
    }

    @Override
    public Bus update(int busId, Bus bus) {
        Optional<Bus> byId = busRepository.findById(busId);
        if (byId.isPresent()){
            Bus updated = busRepository.updateBusById(busId,
                    bus.getBusName(),
                    bus.getDriverName(),
                    bus.getBusType(),
                    bus.getBusRegNo(),
                    bus.getRouteFrom(),
                    bus.getRouteTo(),
                    bus.getArrivalTime(),
                    bus.getDepartureTime(),
                    bus.getSeats(),
                    bus.getAvailableSeats(),
                    bus.getFarePerSeat(),
                    bus.getBusJourneyDate());
            return updated;
        }
        return null;
    }

    @Override
    public Bus getBusByBusName(String busName) {
        Optional<Bus> busOptional = busRepository.findByBusName(busName);
        if (busOptional.isPresent()){
            return busOptional.get();
        }
        return null;
    }

    @Override
    public Bus getBusByType(String busType) {
        Optional<Bus> byBusType = busRepository.findByBusType(busType);
        if (byBusType.isPresent()){
            return byBusType.get();
        }
        return null;
    }
}
