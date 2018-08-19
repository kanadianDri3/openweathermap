package org.lemaire.weather.controller;

import org.lemaire.weather.Weather;
import org.lemaire.weather.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastController {

    private WeatherForecastService weatherForecastService;

    @Autowired
    public WeatherForecastController(WeatherForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }

    @RequestMapping(path = "/weather/{cityName}", method = RequestMethod.GET)
    Weather weatherByCityName(@PathVariable String cityName) {
        return weatherForecastService.getWeatherByCityName(cityName);
    }
}
