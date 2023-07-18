package com.knoldus.vehicleApp.repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.knoldus.vehicleApp.Vehicle;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface VehicleRepository extends FirestoreReactiveRepository<Vehicle> {


}
