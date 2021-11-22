package UC.WeatherRunner;

public class Logbook {
    private int id;
    //Perhaps we should use Date type? But since we're not sure, so we'll use SQL Date or Java Date, let it keep as is.
    private String date;
    private double distance;
    //Same as date var.
    private String time;

    public Logbook() {
        //
    }

    public Logbook(int id, String date, double distance, String time) {
        this.id = id;
        this.date = date;
        this.distance = distance;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Logbook{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", distance='" + distance + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
