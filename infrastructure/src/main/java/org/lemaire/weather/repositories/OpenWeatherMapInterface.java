package org.lemaire.weather.repositories;

import org.lemaire.weather.Weather;

public interface OpenWeatherMapInterface {

    /**
     * Finds the weather of the given city
     * @param cityName the name of the city
     * @return weather data
     */
    public Weather weatherByCityName(final String cityName);
}
