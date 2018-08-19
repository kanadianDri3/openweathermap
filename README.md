# openweathermap
Calling the Open Weather Map (OWM) API to get info about the weather of a city.

This is a personal project to have fun with spring boot.

You will need:
  - maven 3+
  - jdk 8

You can download the project from the git link.

If you choose to open it with your favorite IDE, launch the MainApplication.java (boot module, src/main/java/org/lemaire/)

To have a small demo, open your browser, and go to: http://localhost:8090/openweathermap/index
You can also play with the API using Swagger: http://localhost:8090/openweathermap/swagger-ui.html

# TODO list
More things to add:
  - use more search options given by OWM.
  - have the API key in a property file.
  - add an option to have several API keys.
  - have the time of sunset and sunrise with the local time of the city searched. Needs to be coupled with another 3rd party to have the time zones of a city. OWM only gives the time in UTC.
  - add more info on the web interface.
  - add some behaviour testing.
  - add unit testing on the infrastructure layer.
