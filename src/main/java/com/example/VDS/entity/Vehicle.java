package com.example.VDS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="VEHICLE")
public class Vehicle {

    @Id
    private String vehicleNumber;
    private String ownerName;
    private Date purchaseDate;
    private String color;
    private String make;
    private String vehiclePlateNumber;

    protected Vehicle() {
    }

    public Vehicle(String vehicleNumber, String ownerName, Date purchaseDate, String color, String make, String vehiclePlateNumber) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.purchaseDate = purchaseDate;
        this.color = color;
        this.make = make;
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                '}';
    }
}
