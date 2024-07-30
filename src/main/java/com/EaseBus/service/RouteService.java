package com.EaseBus.service;

import com.EaseBus.model.Route;

import java.util.List;

public interface RouteService {
    Route addNewRoute(Route route);

    List<Route> getAll();
}
