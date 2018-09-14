package com.example.carrentalrest.service;

import com.example.carrentalrest.model.Registration;
import com.example.carrentalrest.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class RegistrationService {

    @Autowired
    RegisterRepo registerRepo;
    JdbcTemplate jdbcTemplate;
public RegistrationService (DataSource dataSource){
    jdbcTemplate=new JdbcTemplate(dataSource);
}
    public void createUser(Registration registration){



    registerRepo.save(registration);
    }

    public List<Registration> getAllUsers(Registration registration){
    List<Registration> users= new ArrayList<>();
    registerRepo.findAll().forEach(new Consumer<Registration>() {
        @Override
        public void accept(Registration registration) {
            users.add(registration);
        }
    });
return users;
    }

    public Registration getUser(Registration registration){
    return registerRepo.findById(registration.getUserName()).get();
    }

    public Registration validateUser(Registration registration){

        String sql = "select username, password from registrationdetails where username = (?)";
    return jdbcTemplate.query(new PreparedStatementCreator() {
                                  @Override
                                  public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                                      PreparedStatement preparedStatement = connection.prepareStatement(sql);
                                      preparedStatement.setString(1, registration.getUserName());
                                      return preparedStatement;
                                  }
                              }, new ResultSetExtractor<Registration>() {
                                  @Override
                                  public Registration extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                                     Registration registration1=new Registration();
                                      while (resultSet.next()) {
                                          registration1.setUserName(resultSet.getString("username"));
                                          registration1.setUserName(resultSet.getString("password"));
                                      }
                                      return registration1;
                                  }
                              }

    );
}
}
