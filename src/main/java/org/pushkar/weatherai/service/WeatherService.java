package org.deepseek.ai.service;

import org.deepseek.ai.outbound.serviceclient.weather.client.WeatherClient;
import org.deepseek.ai.outbound.serviceclient.weather.dto.WeatherRequestDTO;
import org.deepseek.ai.outbound.serviceclient.weather.dto.WeatherResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.function.Function;

@Service
public class WeatherService implements Function<WeatherRequestDTO, WeatherResponseDTO> {

    @Autowired
    private WeatherClient weatherClient;

    @Override
    public WeatherResponseDTO apply(WeatherRequestDTO weatherRequest) {
        WeatherResponseDTO res = weatherClient.getWeather(weatherRequest.city());
        if (null != res){
            return res;
        }
        throw new RestClientException("Weather data not found for city: " + weatherRequest.city());
    }

}
