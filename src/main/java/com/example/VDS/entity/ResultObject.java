package com.example.VDS.entity;

public class ResultObject {

    private String vehicleNumber;
    private String amtToBePaid;
    private String msg;
    private String vehiclePlateNumber;

    public ResultObject() {
    }

    public ResultObject(String vehicleNumber, String amtToBePaid, String msg, String vehiclePlateNumber) {
        this.vehicleNumber = vehicleNumber;
        this.amtToBePaid = amtToBePaid;
        this.msg = msg;
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getAmtToBePaid() {
        return amtToBePaid;
    }

    public void setAmtToBePaid(String amtToBePaid) {
        this.amtToBePaid = amtToBePaid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    @Override
    public String toString() {
        return "ResultObject{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", amtToBePaid='" + amtToBePaid + '\'' +
                ", msg='" + msg + '\'' +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                '}';
    }
}
