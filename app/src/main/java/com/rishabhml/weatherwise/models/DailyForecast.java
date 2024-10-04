package com.rishabhml.weatherwise.models;

public class DailyForecast {

    private String date;
    private String highLowTemp;
    private int iconResId; // Resource ID of the weather icon
    private boolean isExpanded;

    public DailyForecast(String date, String highLowTemp, int iconResId) {
        this.date = date;
        this.highLowTemp = highLowTemp;
        this.iconResId = iconResId;
        this.isExpanded = false;
    }

    // Getters and setters

    public String getDate() {
        return date;
    }

    public String getHighLowTemp() {
        return highLowTemp;
    }

    public int getIconResId() {
        return iconResId;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
