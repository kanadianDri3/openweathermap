package org.lemaire.weather.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lemaire.weather.Weather;
import org.lemaire.weather.location.City;
import org.lemaire.weather.service.WeatherForecastService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class WeatherForecastControllerTest {

    private MockMvc mockMvc;

    @Mock
    private WeatherForecastService weatherForecastServiceMock;

    @InjectMocks
    private WeatherForecastController weatherForecastControllerMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders
                .standaloneSetup(weatherForecastControllerMock)
                .build();
    }

    @Test
    public void givenCityName_whenGetWeather_thenReturnJsonArray() throws Exception {

        Weather weatherLondon = new Weather(
                1534530000L,
                new City("London", "GB"),
                "",
                1534481412L,
                1534533454L
        );
        weatherLondon.setTemperatures(292.69f);

        when(weatherForecastServiceMock.getWeatherByCityName("london")).thenReturn(weatherLondon);

        mockMvc.perform(get("/weather/show/london")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.city.name").value("London"));
    }
}
