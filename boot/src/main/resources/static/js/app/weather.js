$(document).ready(function(){
    $("#weatherSearchResult").hide();

    $("#searchByCityName").click(function(){
        console.log($("#cityNameInput").val());
        $.getJSON("/openweathermap/weather/"+$("#cityNameInput").val(), function(data) {
            $("#daterWeatherReport").append(data.date);
            $("#cityName").append(data.city.name + ', ' + data.city.countryCode);
            $("#weatherDescription").append(data.description);
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