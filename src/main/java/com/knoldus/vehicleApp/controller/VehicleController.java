package com.knoldus.vehicleApp.controller;

import com.knoldus.vehicleApp.Vehicle;
import com.knoldus.vehicleApp.repository.VehicleRepository;
import com.knoldus.vehicleApp.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
    @GetMapping("/brands")
    public Flux<Vehicle> findAllUniqueBrands() {
        return vehicleService.getAllBrands();
    }
    @GetMapping("/getbrands")
    public Flux<String> getAllFieldValues() {
        return vehicleService.getAllFieldValues();
    }
}
