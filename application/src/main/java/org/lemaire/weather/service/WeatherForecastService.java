package org.lemaire.weather.service;

import org.lemaire.weather.Weather;
import org.lemaire.weather.repositories.OpenWeatherMapInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class WeatherForecastService {

    private OpenWeatherMapInterface openWeatherMap;

    @Autowired
    public WeatherForecastService(OpenWeatherMapInterface openWeatherMap) {
        this.openWeatherMap = openWeatherMap;
    }

    public Weather getWeatherByCityName(String cityName) {
        if(!StringUtils.isEmpty(cityName)) {
            return openWeatherMap.weatherByCityName(cityName.toLowerCase());
        }
        else {
            return null;
        }
    }
}
