$(document).ready(function(){
    $("#weatherSearchResult").hide();

    $("#searchByCityName").click(function(){
        $("#dateWeatherReport").empty();
        $("#cityName").empty();
        $("#weatherDescription").empty();
        $("#celsiusTemperature").empty();
        $("#fahrenheitTemperature").empty();
        $("#sunriseTime").empty();
        $("#sunsetTime").empty();

        $.getJSON("/openweathermap/weather/"+$("#cityNameInput").val(), function(data) {
            $("#dateWeatherReport").append('The report is from ' + data.date);
            $("#cityName").append(data.city.name + ', ' + data.city.countryCode);
            $("#weatherDescription").append('weather description: ' + data.description);
            $("#celsiusTemperature").append(data.temperatureCelsius.value + ' celsius');
            $("#fahrenheitTemperature").append(data.temperatureFahrenheit.value + ' fahrenheit');
            $("#sunriseTime").append(data.sunrise + ' UTC');
            $("#sunsetTime").append(data.sunset + ' UTC');
            $("#weatherSearchResult").show();
        })
        .fail(function() {
            console.log( "error" );
        });
    });
});