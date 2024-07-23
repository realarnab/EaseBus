package com.EaseBus.service.impl;

import com.EaseBus.model.Bus;
import com.EaseBus.repository.BusRepository;
import com.EaseBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus addNewBus(Bus bus) {
        return busRepository.save(bus);
    }
}
