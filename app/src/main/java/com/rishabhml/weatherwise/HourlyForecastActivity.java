package com.rishabhml.weatherwise;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rishabhml.weatherwise.Adapters.HourlyForecastAdapter;
import com.rishabhml.weatherwise.models.HourlyForecast;

import java.util.ArrayList;
import java.util.List;

public class HourlyForecastActivity extends AppCompatActivity {

    private RecyclerView recyclerViewHourly;
    private HourlyForecastAdapter adapter;
    private List<HourlyForecast> hourlyForecastList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        // Initialize RecyclerView
        recyclerViewHourly = findViewById(R.id.recyclerViewHourly);
        recyclerViewHourly.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Initialize data
        hourlyForecastList = new ArrayList<>();
        // Populate hourlyForecastList with data
        // For example:
        // hourlyForecastList.add(new HourlyForecast("1 PM", "25°C", R.drawable.ic_weather_sunny));

        // Initialize adapter
        adapter = new HourlyForecastAdapter(hourlyForecastList);
        recyclerViewHourly.setAdapter(adapter);

        // Fetch and display hourly forecast data
        fetchHourlyForecast();
    }

    private void fetchHourlyForecast() {
        // Implement API call to fetch hourly forecast data
        // Update hourlyForecastList and notify adapter
    }
}
