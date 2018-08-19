package org.lemaire.weather.location;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    private static final String CITY_NAME_PARIS = "Paris";
    private static final String COUNTRY_CODE_PARIS = "FR";

    @Test
    public void newCity() {
        final City city = new City(CITY_NAME_PARIS, COUNTRY_CODE_PARIS);

        assertEquals(CITY_NAME_PARIS, city.getName());
        assertEquals(COUNTRY_CODE_PARIS, city.getCountryCode());
    }
}
