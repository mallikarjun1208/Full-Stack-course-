package com.fullstack.find_capital.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fullstack.find_capital.dto.CountryCapitalObj;
import com.fullstack.find_capital.dto.CountryCapitalResponse;

@Service
public class CountryCapitalService implements ICountryCapitalService{

    @Override
    public String getCapital(String country) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CountryCapitalResponse> responseEntity = restTemplate.getForEntity("https://countriesnow.space/api/v0.1/countries/capital",CountryCapitalResponse.class);

      
        Optional<CountryCapitalObj> countryCapitalObj= responseEntity.getBody().getData().stream().filter(object -> {

       return object.getName().equalsIgnoreCase(country);
       }).findAny();

       if(countryCapitalObj.isPresent()){
        return countryCapitalObj.get().getCapital();
    }else{
        return null;
    }
       

    }

}
