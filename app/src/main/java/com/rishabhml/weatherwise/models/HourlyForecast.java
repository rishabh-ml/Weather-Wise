package com.rishabhml.weatherwise.models;

public class HourlyForecast {

    private String time;
    private String temperature;
    private int iconResId; // Resource ID of the weather icon

    public HourlyForecast(String time, String temperature, int iconResId) {
        this.time = time;
        this.temperature = temperature;
        this.iconResId = iconResId;
    }

    // Getters and setters

    public String getTime() {
        return time;
    }

    public String getTemperature() {
        return temperature;
    }

    public int getIconResId() {
        return iconResId;
    }
}
