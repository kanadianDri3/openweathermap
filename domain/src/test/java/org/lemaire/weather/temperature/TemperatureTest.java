package org.lemaire.weather.temperature;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TemperatureTest {

    private static final float KELVIN_TEMP_1 = 284.15f;

    private static final float KELVIN_TEMP_2 = 305.372f;

    @Test
    public void temperature_from_kelvin_to_celsius_ok() {

        final Temperature temperature = new Temperature(KELVIN_TEMP_1, TemperatureUnit.CELSIUS);

        assertEquals(11f, temperature.getValue());
    }

    @Test
    public void temperature_from_kelvin_to_fahrenheit_ok() {

        final Temperature temperature = new Temperature(KELVIN_TEMP_2, TemperatureUnit.FAHRENHEIT);

        assertEquals(90f, temperature.getValue());
    }

    @Test
    public void temperature_from_kelvin_to_celsius_not_ok() {

        final Temperature temperature = new Temperature(KELVIN_TEMP_1, TemperatureUnit.CELSIUS);

        assertNotEquals(12f, temperature.getValue());
    }

    @Test
    public void temperature_from_kelvin_to_fahrenheit_not_ok() {

        final Temperature temperature = new Temperature(KELVIN_TEMP_2, TemperatureUnit.FAHRENHEIT);

        assertNotEquals(95f, temperature.getValue());
    }
}
