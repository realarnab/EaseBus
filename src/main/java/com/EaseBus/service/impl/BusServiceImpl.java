package com.EaseBus.service.impl;

import com.EaseBus.model.Bus;
import com.EaseBus.repository.BusRepository;
import com.EaseBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return busRepository.findById(busId).get();
    }
}
