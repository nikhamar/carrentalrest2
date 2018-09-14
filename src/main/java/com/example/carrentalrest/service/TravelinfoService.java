package com.example.carrentalrest.service;

import com.example.carrentalrest.model.TravelInfo;
import com.example.carrentalrest.repository.RegisterRepo;
import com.example.carrentalrest.repository.TravelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class TravelinfoService {
    @Autowired
    TravelRepo travelRepo;
    JdbcTemplate jdbcTemplate;
    public  TravelinfoService(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
    }
    public void createUserinfo(TravelInfo travelInfo){
TravelInfo travelInfo1= new TravelInfo();
travelInfo1.setPickuplocation(travelInfo.getPickuplocation());
travelInfo1.setDropofflocation(travelInfo.getDropofflocation());
travelInfo1.setPickupDate(travelInfo.getPickupDate());
travelInfo.setDropOffDate(travelInfo.getDropOffDate());
travelInfo.setAge(travelInfo.getAge());
travelInfo1.setCarType(travelInfo.getCarType());
travelInfo1.setCaramount(travelInfo.getCaramount());
travelInfo1.setUserName(travelInfo.getUserName());
        System.out.println(travelInfo1.getDropOffDate()  +  travelInfo1.getAge());
        travelRepo.save(travelInfo);

    }
    public TravelInfo getUserinfo(TravelInfo travelInfo){
        return travelRepo.findById(travelInfo.getUserName()).get();
    }
}
