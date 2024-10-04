package com.rishabhml.weatherwise;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rishabhml.weatherwise.Adapters.AlertsAdapter;
import com.rishabhml.weatherwise.models.Alert;

import java.util.ArrayList;
import java.util.List;

public class AlertsActivity extends AppCompatActivity {

    private RecyclerView recyclerViewAlerts;
    private AlertsAdapter adapter;
    private List<Alert> alertList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);

        // Initialize RecyclerView
        recyclerViewAlerts = findViewById(R.id.recyclerViewAlerts);
        recyclerViewAlerts.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data
        alertList = new ArrayList<>();
        // Populate alertList with data

        // Initialize adapter
        adapter = new AlertsAdapter(alertList);
        recyclerViewAlerts.setAdapter(adapter);

        // Fetch and display alerts
        fetchAlerts();
    }

    private void fetchAlerts() {
        // Implement API call to fetch alerts
        // Update alertList and notify adapter
    }
}
