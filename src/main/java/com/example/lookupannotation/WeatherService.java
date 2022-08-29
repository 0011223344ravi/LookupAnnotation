package com.example.lookupannotation;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

@Service
@Scope("prototype")
public class WeatherService
{
    public String getWeather(){

         String time = LocalDateTime.now().toLocalTime().toString();
        Random random = new Random();

        int temp = random.nextInt(60);
     //   random.doubles();
        return time+"->"+temp;
    }

}
