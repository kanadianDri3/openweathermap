package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class Snow {

    @SerializedName(value = "3h")
    private Float volumeLast3Hours;

    public Float getVolumeLast3Hours() {
        return volumeLast3Hours;
    }

    public void setVolumeLast3Hours(Float volumeLast3Hours) {
        this.volumeLast3Hours = volumeLast3Hours;
    }
}
