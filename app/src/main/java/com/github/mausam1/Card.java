package com.github.mausam1;

public class Card {
    private String advisory, cloud_cover, date, rainfall, rh1, rh2, summary, tmax, tmin, wind_direction, wind_speed;

    public Card(String advisory, String cloud_cover, String date, String rainfall, String rh1, String rh2, String summary, String tmax, String tmin, String wind_direction, String wind_speed) {
        this.advisory = advisory;
        this.cloud_cover = cloud_cover;
        this.date = date;
        this.rainfall = rainfall;
        this.rh1 = rh1;
        this.rh2 = rh2;
        this.summary = summary;
        this.tmax = tmax;
        this.tmin = tmin;
        this.wind_direction = wind_direction;
        this.wind_speed = wind_speed;
    }

    public Card() {
    }

    public String getAdvisory() {
        return advisory;
    }

    public void setAdvisory(String advisory) {
        this.advisory = advisory;
    }

    public String getCloud_cover() {
        return cloud_cover;
    }

    public void setCloud_cover(String cloud_cover) {
        this.cloud_cover = cloud_cover;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public String getRh1() {
        return rh1;
    }

    public void setRh1(String rh1) {
        this.rh1 = rh1;
    }

    public String getRh2() {
        return rh2;
    }

    public void setRh2(String rh2) {
        this.rh2 = rh2;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTmax() {
        return tmax;
    }

    public void setTmax(String tmax) {
        this.tmax = tmax;
    }

    public String getTmin() {
        return tmin;
    }

    public void setTmin(String tmin) {
        this.tmin = tmin;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

}
