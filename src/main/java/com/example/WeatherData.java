package com.example;

public class WeatherData {
    private String date;
    private String location;
    private double temperature;
    private double pressure;
    private int humidity;

    public WeatherData(String date, String location, double temperature, double pressure, int humidity) {
        this.date = date;
        this.location = location;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }
}

