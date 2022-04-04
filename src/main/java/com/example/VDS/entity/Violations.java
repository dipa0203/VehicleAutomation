package com.example.VDS.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name="VIOLATIONS")
public class Violations {

    @Id
    private String vehicleNumber;
    private String violationType;
    private Date violationDate;
    private double fineAmount;
    private double paidAmount;
    private String activeInd;

    protected Violations() {
    }

    public Violations(String vehicleNumber, String violationType, Date violationDate, double fineAmount, double paidAmount, String activeInd) {
        this.vehicleNumber = vehicleNumber;
        this.violationType = violationType;
        this.violationDate = violationDate;
        this.fineAmount = fineAmount;
        this.paidAmount = paidAmount;
        this.activeInd = activeInd;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public Date getViolationDate() {
        return violationDate;
    }

    public void setViolationDate(Date violationDate) {
        this.violationDate = violationDate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getActiveInd() {
        return activeInd;
    }

    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    @Override
    public String toString() {
        return "Violations{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", violationType='" + violationType + '\'' +
                ", violationDate=" + violationDate +
                ", fineAmount=" + fineAmount +
                ", paidAmount=" + paidAmount +
                ", activeInd='" + activeInd + '\'' +
                '}';
    }
}
