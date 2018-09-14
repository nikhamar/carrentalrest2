package com.example.carrentalrest.repository;

import com.example.carrentalrest.model.TravelInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepo extends CrudRepository<TravelInfo, String> {
}
