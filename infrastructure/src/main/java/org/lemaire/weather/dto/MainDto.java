package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class MainDto {

    @SerializedName(value = "temp")
    private Float temperature;

    @SerializedName(value = "pressure")
    private Float pressure;

    @SerializedName(value = "humidity")
    private Float humidity;

    @SerializedName(value = "temp_min")
    private Float minTemperature;

    @SerializedName(value = "temp_max")
    private Float maxTemperature;

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
