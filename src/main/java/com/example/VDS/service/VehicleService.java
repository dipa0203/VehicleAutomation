package com.example.VDS.service;

import com.example.VDS.entity.ResultObject;
import com.example.VDS.entity.Vehicle;
import java.util.List;

@FunctionalInterface
public interface VehicleService {

    ResultObject getVehicleWithDeviations(String vehiclePlateNumber);
}
