package com.EaseBus.repository;

import com.EaseBus.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RouteRepository extends JpaRepository<Route,Integer> {
    @Query("Update Route r where ")
    Route updateRoute(@Param("routeId") Integer routeId);
}
