package org.lemaire.weather.repositories;

import com.google.gson.Gson;
import org.lemaire.weather.Weather;
import org.lemaire.weather.WeatherForecast;
import org.lemaire.weather.location.City;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Repository
public class OpenWeatherMapImpl implements OpenWeatherMapInterface {

    private static final String OPEN_WEATHER_MAP_API_KEY = "dd078bc26ce9bf327115ee576c61adb9";

    private static final String URI_OPEN_WEATHER_MAP_API = "http://api.openweathermap.org/data/2.5";

    private static final String PATH_WEATHER = "weather";

    private static final String QUERY_PARAM_CITY_NAME = "q";

    private static final String QUERY_PARAM_APP_ID = "appid";

    private static final int HTTP_STATUT_SUCCESS = 200;

    private WebTarget weatherWebTarget;

    private Gson gson;

    @PostConstruct
    public void init() {
        final WebTarget webTarget = ClientBuilder.newClient().target(URI_OPEN_WEATHER_MAP_API);
        weatherWebTarget = webTarget.path(PATH_WEATHER).queryParam(QUERY_PARAM_APP_ID, OPEN_WEATHER_MAP_API_KEY);
        gson = new Gson();
    }

    public Weather weatherByCityName(String cityName) {
        final WebTarget openWeatherMapRequest = weatherWebTarget.queryParam(QUERY_PARAM_CITY_NAME, cityName);

        final Invocation.Builder builder = openWeatherMapRequest.request();
        final Response response = builder.accept(MediaType.APPLICATION_JSON_TYPE).get();

        WeatherForecast weatherForecast = null;

        try {
            if (response.getStatus() == HTTP_STATUT_SUCCESS) {
                weatherForecast = gson.fromJson(response.readEntity(String.class), WeatherForecast.class);
            }
        } finally {
            response.close();
        }

        if(weatherForecast != null) {
            return convertWeatherForecastToWeather(weatherForecast);
        }
        else {
            return null;
        }
    }

    private Weather convertWeatherForecastToWeather(final WeatherForecast weatherForecast) {
        final City city = new City(weatherForecast.getCityName(), weatherForecast.getSystem().getCountry());
        String description = "";

        if(weatherForecast.getWeather().length == 1) {
            description = weatherForecast.getWeather()[0].getDescription();
        }

        final Weather weather = new Weather(
                weatherForecast.getDateOfForecast(),
                city,
                description,
                weatherForecast.getSystem().getSunrise(),
                weatherForecast.getSystem().getSunset()
        );

        weather.setTemperatures(weatherForecast.getMainData().getTemperature());

        return weather;
    }
}
