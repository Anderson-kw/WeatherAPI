package com.weather.WeatherAPI.dto;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data //
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private String resolvedAddress;
    private String description;

    @JsonProperty("currentConditions")
    private CurrentConditions currentConditions;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentConditions {
        private Double temp;
        private Double humidity;
        private String conditions;
    }
}