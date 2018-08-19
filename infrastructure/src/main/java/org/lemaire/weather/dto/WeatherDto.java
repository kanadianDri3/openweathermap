package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {

    @SerializedName(value = "id")
    private Integer id;

    @SerializedName(value = "main")
    private String mainWeather;

    @SerializedName(value = "description")
    private String description;

    @SerializedName(value = "icon")
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainWeather() {
        return mainWeather;
    }

    public void setMainWeather(String mainWeather) {
        this.mainWeather = mainWeather;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
