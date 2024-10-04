package com.rishabhml.weatherwise.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.rishabhml.weatherwise.R;
import com.rishabhml.weatherwise.models.Alert;

import java.util.List;

public class AlertsAdapter extends RecyclerView.Adapter<AlertsAdapter.ViewHolder> {

    private List<Alert> alertList;

    public AlertsAdapter(List<Alert> alertList) {
        this.alertList = alertList;
    }

    @Override
    public AlertsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alert, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlertsAdapter.ViewHolder holder, int position) {
        Alert alert = alertList.get(position);
        holder.textViewAlertTitle.setText(alert.getTitle());
        holder.textViewAlertDescription.setText(alert.getDescription());
    }

    @Override
    public int getItemCount() {
        return alertList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewAlertTitle;
        public TextView textViewAlertDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewAlertTitle = itemView.findViewById(R.id.textViewAlertTitle);
            textViewAlertDescription = itemView.findViewById(R.id.textViewAlertDescription);
        }
    }
}
