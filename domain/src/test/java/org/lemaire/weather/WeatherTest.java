package org.lemaire.weather;

import org.junit.Test;
import org.lemaire.weather.location.City;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WeatherTest {

    private static final Long TODAY_TIMESTAMP = 1534530000L;

    private static final Long SUNRISE_TIMESTAMP = 1534481412L;

    private static final Long SUNSET_TIMESTAMP = 1534533454L;

    private static final String TODAY_STRING = "Fri, Aug 17 2018";

    private static final String SUNRISE_STRING = "4:50 AM";

    private static final String SUNSET_STRING = "7:17 PM";

    @Test
    public void weather_date_ok() {
        final Weather weather = new Weather(
                TODAY_TIMESTAMP,
                new City("London", "GB"),
                "test",
                SUNRISE_TIMESTAMP,
                SUNSET_TIMESTAMP
        );

        assertEquals(TODAY_STRING, weather.getDate());
        assertEquals(SUNRISE_STRING, weather.getSunrise());
        assertEquals(SUNSET_STRING, weather.getSunset());
    }

    @Test
    public void weather_date_not_ok() {
        final Weather weather = new Weather(
                TODAY_TIMESTAMP,
                new City("London", "GB"),
                "test",
                SUNRISE_TIMESTAMP,
                SUNSET_TIMESTAMP
        );

        assertNotEquals("Fri, Aug 16 2018", weather.getDate());
        assertNotEquals("4:50 PM", weather.getSunrise());
        assertNotEquals("7:17 AM", weather.getSunset());
    }
}
