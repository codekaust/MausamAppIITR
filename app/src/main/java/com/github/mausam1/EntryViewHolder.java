package com.github.mausam1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EntryViewHolder extends RecyclerView.ViewHolder {

    View mView;

    private TextView advisory, cloud_cover, date, rainfall, rh1, rh2, summary, tmax, tmin, wind_direction, wind_speed;

    public EntryViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void setAdvisory(String advisory) {
        this.advisory = (TextView) mView.findViewById(R.id.tv_card_advisory);
        this.advisory.setText(advisory);
    }

    public void setCloud_cover(String cloud_cover) {
        this.cloud_cover = (TextView) mView.findViewById(R.id.tv_card_cloudcover);
        this.cloud_cover.setText(cloud_cover);
    }

    public void setDate(String date) {
        this.date = (TextView) mView.findViewById(R.id.tv_card_date);
        this.date.setText(date);
    }

    public void setRainfall(String rainfall) {
        this.rainfall = (TextView) mView.findViewById(R.id.tv_card_rainfall);
        this.rainfall.setText(rainfall);
    }

    public void setRh1(String rh1) {
        this.rh1 = (TextView) mView.findViewById(R.id.tv_card_rh1);
        this.rh1.setText(rh1);
    }

    public void setRh2(String rh2) {
        this.rh2 = (TextView) mView.findViewById(R.id.tv_card_rh2);
        this.rh2.setText(rh2);
    }

    public void setSummary(String summary) {
        this.summary = (TextView) mView.findViewById(R.id.tv_card_summary);
        this.summary.setText(summary);
    }

    public void setTmax(String tmax) {
        this.tmax = (TextView) mView.findViewById(R.id.tv_card_tmax);
        this.tmax.setText(tmax);
    }

    public void setTmin(String tmin) {
        this.tmin = (TextView) mView.findViewById(R.id.tv_card_tmin);
        this.tmin.setText(tmin);
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = (TextView) mView.findViewById(R.id.tv_card_winddir);
        this.wind_direction.setText(wind_direction);
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = (TextView) mView.findViewById(R.id.tv_card_windspeed);
        this.wind_speed.setText(wind_speed);
    }
}