package org.lemaire.weather.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lemaire.weather.Weather;
import org.lemaire.weather.location.City;
import org.lemaire.weather.repositories.OpenWeatherMapInterface;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WeatherForecastServiceTest {

    @Mock
    private OpenWeatherMapInterface openWeatherMapInterfaceMock;

    @InjectMocks
    private WeatherForecastService weatherForecastService;

    private static final String LONDON = "london";

    private Weather weatherDataLondon;

    @Before
    public void setUp() {
        weatherForecastService = new WeatherForecastService(openWeatherMapInterfaceMock);

        weatherDataLondon = new Weather(
                1534530000L,
                new City("London", "GB"),
                "",
                1534481412L,
                1534533454L
        );
        weatherDataLondon.setTemperatures(292.69f);

        when(openWeatherMapInterfaceMock.weatherByCityName(LONDON)).thenReturn(weatherDataLondon);
    }

    @Test
    public void testGetWeatherFromLondon() {

        final Weather weatherInLondon = weatherForecastService.getWeatherByCityName(LONDON);

        assertEquals(weatherDataLondon, weatherInLondon);
    }

}
