package org.deepseek.ai.outbound.serviceclient.weather.client;

import org.deepseek.ai.outbound.serviceclient.weather.dto.WeatherResponseDTO;

public interface WeatherClient {

    WeatherResponseDTO getWeather(String cityName);
}
