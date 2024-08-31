package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.ViewHolder> {
    private List<HolidayItem> holidayList;

    public HolidayAdapter(List<HolidayItem> holidayList) {
        this.holidayList = holidayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holiday, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HolidayItem item = holidayList.get(position);
        holder.textMonth.setText(item.getMonth());
        holder.textHolidays.setText(item.getHolidays());
    }

    @Override
    public int getItemCount() {
        return holidayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textMonth, textHolidays;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textMonth = itemView.findViewById(R.id.textMonth);
            textHolidays = itemView.findViewById(R.id.textHolidays);
        }
    }
}
