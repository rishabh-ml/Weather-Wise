package com.rishabhml.weatherwise.models;

public class Alert {

    private String title;
    private String description;

    public Alert(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
