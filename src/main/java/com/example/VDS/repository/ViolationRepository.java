package com.example.VDS.repository;

import com.example.VDS.entity.Violations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViolationRepository  extends CrudRepository<Violations, Long>  {

    List<Violations> findByVehicleNumber(String vehicleNumber);
}
