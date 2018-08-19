package org.lemaire.weather.dto;

import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName(value = "all")
    private Integer cloudiness;

    public Integer getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(Integer cloudiness) {
        this.cloudiness = cloudiness;
    }
}
