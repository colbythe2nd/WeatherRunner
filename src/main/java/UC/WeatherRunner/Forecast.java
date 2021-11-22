package UC.WeatherRunner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String time;
    private Periods[] periods;

    public Forecast() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String date) {
        this.time = date;
    }

    public Periods[] getPeriods() {
        return periods;
    }

    public void setPeriods(Periods[] value) {
        this.periods = value;
    }
    
    //returns toString of the quote with time and periods
    @Override
    public String toString() {
        return "Quote{" +
                "time='" + time + '\'' +
                ", periods=" + periods +
                '}';
    }
}