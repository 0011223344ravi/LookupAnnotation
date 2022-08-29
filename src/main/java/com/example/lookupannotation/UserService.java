package com.example.lookupannotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private WeatherService weatherService;

    public String getWeatherByUser(){

        return getWeatherServiceBean().getWeather();
    }

    @Lookup
    public WeatherService getWeatherServiceBean(){
        return null;
    }
}
