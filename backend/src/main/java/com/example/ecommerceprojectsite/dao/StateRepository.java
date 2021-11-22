package com.example.ecommerceprojectsite.dao;

import com.example.ecommerceprojectsite.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {

    //To retrieve states for a given country code
    // http://localhost:808/api/states/search/findByCountryCode?code=US
    List<State> findByCountryCode(@Param("code") String code);
}
