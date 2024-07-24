package com.EaseBus.service.impl;

import com.EaseBus.model.Route;
import com.EaseBus.repository.RouteRepository;
import com.EaseBus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;
    @Override
    public Route addNewRoute(Route route) {
        return routeRepository.save(route);
    }
}
