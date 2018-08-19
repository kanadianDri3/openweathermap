package org.lemaire.weather.location;

public class City {

    private String name;

    private String countryCode;

    public City(String name, String countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
