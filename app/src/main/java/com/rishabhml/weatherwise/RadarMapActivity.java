package com.rishabhml.weatherwise;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.MapView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RadarMapActivity extends AppCompatActivity {

    private MapView mapView;
    private FloatingActionButton fabLayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_map);

        mapView = findViewById(R.id.mapView);
        fabLayers = findViewById(R.id.fabLayers);

        // Initialize the map
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(googleMap -> {
            // Configure the map
            // Add weather overlays
        });

        fabLayers.setOnClickListener(view -> {
            // Show layer selection dialog
            Toast.makeText(this, "Select weather layer", Toast.LENGTH_SHORT).show();
        });
    }

    // Handle mapView lifecycle methods
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    // Other lifecycle methods...
}
