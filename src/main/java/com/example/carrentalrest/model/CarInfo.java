package com.example.carrentalrest.model;

import javax.persistence.*;

@Entity
@Table(name = "carinfo", schema = "carrentalschema")
public class CarInfo {
    @Id
    @Column(name = "cartype")
    public String carType;
    @Column(name="carname")
    public String carName;
    @Column(name="passengercap")
    public int passengerCap;
    @Column(name="geartype")
    public String gearType;
    @Column(name="caramount")
    public int caramount;

    public CarInfo() {
    }

    public CarInfo(String carType, String carName, int passengerCap, String gearType, int caramount) {
        this.carType = carType;
        this.carName = carName;
        this.passengerCap = passengerCap;
        this.gearType = gearType;
        this.caramount = caramount;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPassengerCap() {
        return passengerCap;
    }

    public void setPassengerCap(int passengerCap) {
        this.passengerCap = passengerCap;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public int getCaramount() {
        return caramount;
    }

    public void setCaramount(int caramount) {
        this.caramount = caramount;
    }
}

