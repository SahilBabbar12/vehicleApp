package com.knoldus.vehicleApp.service;

import com.knoldus.vehicleApp.Vehicle;
import com.knoldus.vehicleApp.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    public Flux<Vehicle> getAllBrands(){
        return vehicleRepository.findAll();
    }
}
