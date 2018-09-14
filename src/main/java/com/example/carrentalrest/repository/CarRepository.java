package com.example.carrentalrest.repository;

import com.example.carrentalrest.model.CarInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<CarInfo,String> {


}
