package org.lemaire.weather;

import org.lemaire.weather.location.City;
import org.lemaire.weather.temperature.Temperature;
import org.lemaire.weather.temperature.TemperatureUnit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class Weather {

    private String date;

    private City city;

    private String description;

    private Temperature temperatureCelsius;

    private Temperature temperatureFahrenheit;

    private String sunrise;

    private String sunset;

    private static final String dateFormatToday = "EEE, MMM d yyyy";
    private static final String dateFormatSunTime = "h:mm a";

    public Weather(Long today, City city, String description, Long sunrise, Long sunset) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatToday);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.date = dateFormat.format(new Date(today*1000));
        this.city = city;
        this.description = description;

        dateFormat = new SimpleDateFormat(dateFormatSunTime);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.sunrise = dateFormat.format(new Date(sunrise*1000));
        this.sunset = dateFormat.format(new Date(sunset*1000));
    }

    public void setTemperatures(float temperature) {
        this.temperatureCelsius = new Temperature(temperature, TemperatureUnit.CELSIUS);
        this.temperatureFahrenheit = new Temperature(temperature, TemperatureUnit.FAHRENHEIT);
    }

    public String getDate() {
        return date;
    }

    public City getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public Temperature getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public Temperature getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return Objects.equals(date, weather.date) &&
                Objects.equals(city, weather.city) &&
                Objects.equals(description, weather.description) &&
                Objects.equals(temperatureCelsius, weather.temperatureCelsius) &&
                Objects.equals(temperatureFahrenheit, weather.temperatureFahrenheit) &&
                Objects.equals(sunrise, weather.sunrise) &&
                Objects.equals(sunset, weather.sunset);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, city, description, temperatureCelsius, temperatureFahrenheit, sunrise, sunset);
    }
}
