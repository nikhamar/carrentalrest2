package com.example.carrentalrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdata",schema = "carrentalschema")

public class TravelInfo {
    @Column(name = "pickuplocation")
    public String pickuplocation;
    @Column(name = "dropofflocation")
    public String dropofflocation;
    @Column(name = "pickupdate")
    public String pickupDate;
    @Column(name = "dropoffdate")
    public String dropOffDate;
    @Column(name = "age")
    public int age;
    @Column(name = "cartype")
    public String carType;
    @Column(name = "caramount")
    public int caramount;
    @Id
    @Column(name = "username")
    public String userName;

    public TravelInfo(String pickuplocation, String dropofflocation, String pickupDate, String dropOffDate, int age, String carType, int caramount, String userName) {
        this.pickuplocation = pickuplocation;
        this.dropofflocation = dropofflocation;
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.age = age;
        this.carType = carType;
        this.caramount = caramount;
        this.userName = userName;
    }

    public TravelInfo() {
    }

    public String getPickuplocation() {
        return pickuplocation;
    }

    public void setPickuplocation(String pickuplocation) {
        this.pickuplocation = pickuplocation;
    }

    public String getDropofflocation() {
        return dropofflocation;
    }

    public void setDropofflocation(String dropofflocation) {
        this.dropofflocation = dropofflocation;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(String dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCaramount() {
        return caramount;
    }

    public void setCaramount(int caramount) {
        this.caramount = caramount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}