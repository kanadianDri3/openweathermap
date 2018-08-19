package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class Rain {

    @SerializedName(value = "3h")
    private float volumeLast3Hours;

    public float getVolumeLast3Hours() {
        return volumeLast3Hours;
    }

    public void setVolumeLast3Hours(float volumeLast3Hours) {
        this.volumeLast3Hours = volumeLast3Hours;
    }
}
