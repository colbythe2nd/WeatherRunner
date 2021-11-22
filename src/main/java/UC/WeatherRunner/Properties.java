package UC.WeatherRunner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    private UC.WeatherRunner.Forecast forecast;

    public UC.WeatherRunner.Forecast getForecast() {
        return forecast;
    }

    public void setForecast(UC.WeatherRunner.Forecast forecast) {
        this.forecast = forecast;
    }

    //returns toString of the properties consisting of the forecast
    @Override
    public String toString() {
        return "Properties{" +
                "forecast='" + forecast + '\'' +
                '}';
    }
}
