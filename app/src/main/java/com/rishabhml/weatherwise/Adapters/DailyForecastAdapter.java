package com.rishabhml.weatherwise.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.rishabhml.weatherwise.R;
import com.rishabhml.weatherwise.models.DailyForecast;

import java.util.List;

public class DailyForecastAdapter extends RecyclerView.Adapter<DailyForecastAdapter.ViewHolder> {

    private List<DailyForecast> dailyForecastList;

    public DailyForecastAdapter(List<DailyForecast> dailyForecastList) {
        this.dailyForecastList = dailyForecastList;
    }

    @Override
    public DailyForecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_forecast, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DailyForecastAdapter.ViewHolder holder, int position) {
        DailyForecast forecast = dailyForecastList.get(position);
        holder.textViewDate.setText(forecast.getDate());
        holder.textViewHighLow.setText(forecast.getHighLowTemp());
        holder.imageViewIcon.setImageResource(forecast.getIconResId());

        // Handle expansion
        boolean isExpanded = forecast.isExpanded();
        holder.layoutDetails.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        holder.itemView.setOnClickListener(view -> {
            forecast.setExpanded(!forecast.isExpanded());
            notifyItemChanged(position);
        });
    }

    @Override
    public int getItemCount() {
        return dailyForecastList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewDate;
        public TextView textViewHighLow;
        public ImageView imageViewIcon;
        public View layoutDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewHighLow = itemView.findViewById(R.id.textViewHighLow);
            imageViewIcon = itemView.findViewById(R.id.imageViewIcon);
            layoutDetails = itemView.findViewById(R.id.layoutDetails);
        }
    }
}
