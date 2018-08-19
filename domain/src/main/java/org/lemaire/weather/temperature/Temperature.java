package org.lemaire.weather.temperature;

import java.math.BigDecimal;

public class Temperature {

    private float value;

    private TemperatureUnit unit;

    public Temperature(float value, TemperatureUnit unit) {
        switch (unit) {
            case CELSIUS:
                this.value = round(value - 273.15f);
                break;
            case FAHRENHEIT:
                value = value * 9 / 5;
                this.value = round(value - 459.67f);
                break;
        }

        this.unit = unit;
    }

    private float round(float value) {
        BigDecimal bd = new BigDecimal(Float.toString(value));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    public float getValue() {
        return value;
    }

    public TemperatureUnit getUnit() {
        return unit;
    }
}
