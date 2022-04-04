package com.example.VDS.controller;


import com.example.VDS.entity.ResultObject;
import com.example.VDS.entity.Vehicle;
import com.example.VDS.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleViolationController {

    @Autowired
    VehicleService vehicleService;



    @GetMapping(value = "/{vehiclePlateNo}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultObject getVehicleViolationStatus(@PathVariable String vehiclePlateNo)
    {
        return vehicleService.getVehicleWithDeviations(vehiclePlateNo);
    }
}
