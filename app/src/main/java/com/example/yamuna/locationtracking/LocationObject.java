package com.example.yamuna.locationtracking;

/**
 * Created by Yamuna on 6/10/2018.
 */

public class LocationObject {
    double latitude;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    long time;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    double longitude;

    public LocationObject(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public LocationObject(long time, double lat, double lon) {
        this.time = time;
        this.longitude = lon;
        this.latitude=lat;
    }
}
