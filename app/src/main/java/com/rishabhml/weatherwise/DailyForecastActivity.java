package com.rishabhml.weatherwise;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rishabhml.weatherwise.Adapters.DailyForecastAdapter;
import com.rishabhml.weatherwise.models.DailyForecast;

import java.util.ArrayList;
import java.util.List;

public class DailyForecastActivity extends AppCompatActivity {

    private RecyclerView recyclerViewDaily;
    private DailyForecastAdapter adapter;
    private List<DailyForecast> dailyForecastList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        // Initialize RecyclerView
        recyclerViewDaily = findViewById(R.id.recyclerViewDaily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data
        dailyForecastList = new ArrayList<>();
        // Populate dailyForecastList with data

        // Initialize adapter
        adapter = new DailyForecastAdapter(dailyForecastList);
        recyclerViewDaily.setAdapter(adapter);

        // Fetch and display daily forecast data
        fetchDailyForecast();
    }

    private void fetchDailyForecast() {
        // Implement API call to fetch daily forecast data
        // Update dailyForecastList and notify adapter
    }
}
