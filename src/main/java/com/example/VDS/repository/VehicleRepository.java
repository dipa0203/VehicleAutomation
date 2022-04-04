package com.example.VDS.repository;

import com.example.VDS.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository  extends CrudRepository<Vehicle, Long>  {
    Vehicle findByVehiclePlateNumber(String vehiclePlateNumber);
}
