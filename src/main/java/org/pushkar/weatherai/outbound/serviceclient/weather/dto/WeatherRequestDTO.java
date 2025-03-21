package org.deepseek.ai.outbound.serviceclient.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherRequestDTO(String city) { }
