package org.lemaire.weather;

import com.google.gson.annotations.SerializedName;
import org.lemaire.weather.dto.*;

public class WeatherForecast {

    @SerializedName(value = "id")
    private Long cityId;

    @SerializedName(value = "coord")
    private Coordinates coordinates;

    @SerializedName(value = "weather")
    private WeatherDto[] weather;

    @SerializedName(value = "base")
    private String base;

    @SerializedName(value = "main")
    private MainDto mainData;

    @SerializedName(value = "visibility")
    private Float visibility;

    @SerializedName(value = "wind")
    private Wind wind;

    @SerializedName(value = "clouds")
    private Clouds clouds;

    @SerializedName(value = "dt")
    private Long dateOfForecast;

    @SerializedName(value = "sys")
    private SystemDto system;

    @SerializedName(value = "name")
    private String cityName;

    @SerializedName(value = "cod")
    private String cod;

    @SerializedName(value = "rain")
    private Rain rain;

    @SerializedName(value = "snow")
    private Snow snow;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public WeatherDto[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherDto[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDto getMainData() {
        return mainData;
    }

    public void setMainData(MainDto mainData) {
        this.mainData = mainData;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getDateOfForecast() {
        return dateOfForecast;
    }

    public void setDateOfForecast(Long dateOfForecast) {
        this.dateOfForecast = dateOfForecast;
    }

    public SystemDto getSystem() {
        return system;
    }

    public void setSystem(SystemDto system) {
        this.system = system;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }
}
