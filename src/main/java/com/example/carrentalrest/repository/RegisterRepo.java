package com.example.carrentalrest.repository;

import com.example.carrentalrest.model.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends CrudRepository<Registration, String> {
}
