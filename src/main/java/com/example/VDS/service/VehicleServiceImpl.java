package com.example.VDS.service;

import com.example.VDS.entity.ResultObject;
import com.example.VDS.entity.Vehicle;
import com.example.VDS.entity.Violations;
import com.example.VDS.repository.VehicleRepository;
import com.example.VDS.repository.ViolationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {

    private static final Logger LOGGER= LoggerFactory.getLogger(VehicleServiceImpl.class);

    @Autowired
    public VehicleRepository vehicleRepository;

    @Autowired
    public ViolationRepository violationRepository;

    @Override
    public ResultObject getVehicleWithDeviations(String vehiclePlateNumber) {

        ResultObject vehicleWithDeviations = new ResultObject();
        String errorMsg;

        Vehicle vehicleToReview = vehicleRepository.findByVehiclePlateNumber(vehiclePlateNumber);


        if(Optional.ofNullable(vehicleToReview).isPresent()) {

         List<Violations> violationsList =  violationRepository.findByVehicleNumber(vehicleToReview.getVehicleNumber());

         if(!violationsList.isEmpty()) {

             double sumOfFineAmount = violationsList.stream().filter(s -> s.getActiveInd().equalsIgnoreCase("Y")).mapToDouble(x -> x.getFineAmount()).sum();

             double sumOfPaidAmount = violationsList.stream().filter(s -> s.getActiveInd().equalsIgnoreCase("Y")).mapToDouble(x -> x.getPaidAmount()).sum();

             double amountToBePaid = sumOfFineAmount - sumOfPaidAmount;

             vehicleWithDeviations.setVehicleNumber(vehicleToReview.getVehicleNumber());

             vehicleWithDeviations.setAmtToBePaid(String.valueOf(amountToBePaid));

             if (amountToBePaid == 0) {

                 vehicleWithDeviations.setMsg("No pending fine amount");

             } else {
                 vehicleWithDeviations.setMsg("Amount to be paid: "+amountToBePaid);
             }

             vehicleWithDeviations.setVehiclePlateNumber(vehiclePlateNumber);

         } else {
             errorMsg = "No violations found";
             LOGGER.info(errorMsg);
             vehicleWithDeviations.setMsg(errorMsg);
         }

        } else {
            errorMsg = "Vehicle not present";
            LOGGER.info(errorMsg);
            vehicleWithDeviations.setMsg(errorMsg);
        }
        return vehicleWithDeviations;

    }
}
