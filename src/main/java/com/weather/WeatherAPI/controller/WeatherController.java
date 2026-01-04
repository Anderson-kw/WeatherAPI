package com.weather.WeatherAPI.controller;

import com.weather.WeatherAPI.dto.WeatherResponse;
import com.weather.WeatherAPI.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Diz ao Spring: "Esta classe recebe pedidos da internet"
@CrossOrigin(origins = "*")
public class WeatherController {

    @Autowired // Injeta o nosso Service aqui automaticamente
    private WeatherService weatherService;

    @GetMapping("/weather") // Define o endereço: localhost:8080/weather
    public WeatherResponse getWeather(@RequestParam String city) {
        // O controller apenas repassa a tarefa para o service
        return weatherService.getWeather(city);
    }
}