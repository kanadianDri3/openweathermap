package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName(value = "speed")
    private Float speed;

    @SerializedName(value = "deg")
    private Float degrees;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Float getDegrees() {
        return degrees;
    }

    public void setDegrees(Float degrees) {
        this.degrees = degrees;
    }
}
