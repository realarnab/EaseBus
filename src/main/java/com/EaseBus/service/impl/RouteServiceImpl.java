package com.EaseBus.service.impl;

import com.EaseBus.exceptions.RouteNotFoundException;
import com.EaseBus.model.Route;
import com.EaseBus.repository.RouteRepository;
import com.EaseBus.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;
    @Override
    public Route addNewRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public List<Route> getAll() {
        return routeRepository.findAll();
    }

    @Override
    public void deleteRouteById(int routeId) throws RouteNotFoundException {
        Route route = routeRepository.findById(routeId).orElseThrow(() -> new RouteNotFoundException("Route Not Found"));
        if (route!=null){
            routeRepository.deleteById(routeId);
        }
    }
}
