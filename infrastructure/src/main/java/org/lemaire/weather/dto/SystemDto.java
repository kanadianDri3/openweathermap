package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class SystemDto {

    @SerializedName(value = "id")
    private Integer id;

    @SerializedName(value = "type")
    private Integer type;

    @SerializedName(value = "message")
    private String message;

    @SerializedName(value = "country")
    private String country;

    @SerializedName(value = "sunrise")
    private Long sunrise;

    @SerializedName(value = "sunset")
    private Long sunset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }
}
