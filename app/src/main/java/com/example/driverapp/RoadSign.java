package com.example.driverapp;

public class RoadSign {

    private int id;
    private String name, longitude, latitude;
    private double heading;
    private float distance = 110;

    public RoadSign(String id, String name, String longitude, String latitude, String heading, String distance) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.heading = Double.valueOf(heading);
        this.distance = Float.parseFloat(distance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public double getHeading() {
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }


    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}