package com.weather.WeatherAPI.service;

import com.weather.WeatherAPI.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.cache.annotation.Cacheable;

@Service
public class WeatherService {

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.key}")
    private String apiKey;

    @Cacheable("weather")
    public WeatherResponse getWeather(String city) {

        String finalUrl = apiUrl + "/" + city + "?key=" + apiKey;

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(finalUrl, WeatherResponse.class);
    }
}