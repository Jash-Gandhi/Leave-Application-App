package com.example.myapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Holiday1 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HolidayAdapter adapter;
    private List<HolidayItem> holidayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday1);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        prepareHolidayData();
        adapter = new HolidayAdapter(holidayList);
        recyclerView.setAdapter(adapter);
    }

    private void prepareHolidayData() {
        holidayList = new ArrayList<>();

        // Add holiday items
        holidayList.add(new HolidayItem("January", getAllJanuaryHolidays()));
        holidayList.add(new HolidayItem("February", getAllFebruaryHolidays()));
        holidayList.add(new HolidayItem("March", getAllMarchHolidays()));
        holidayList.add(new HolidayItem("April", getAllAprilHolidays()));
        holidayList.add(new HolidayItem("May", getAllMayHolidays()));
        holidayList.add(new HolidayItem("June", getAllJuneHolidays()));
        holidayList.add(new HolidayItem("July", ""));
        holidayList.add(new HolidayItem("August", getAllAugustHolidays()));
        holidayList.add(new HolidayItem("September", getAllSeptemberHolidays()));
        holidayList.add(new HolidayItem("October", getAllOctoberHolidays()));
        holidayList.add(new HolidayItem("November", getAllNovemberHolidays()));
        holidayList.add(new HolidayItem("December", getAllDecemberHolidays()));
    }

    private String formatHoliday(String date, String name) {
        return date + " - " + name;
    }

    private String getAllJanuaryHolidays() {
        return formatHoliday("1st January", "New Year's Day") + "\n" +
                formatHoliday("14th January", "Pongal/Makar Sankranti") + "\n" +
                formatHoliday("26th January", "Republic Day (National Holiday)");
    }

    private String getAllFebruaryHolidays() {
        return formatHoliday("5th February", "Basant Panchami") + "\n" +
                formatHoliday("21st February", "Maha Shivaratri");
    }

    private String getAllMarchHolidays() {
        return formatHoliday("9th March", "Holi") + "\n" +
                formatHoliday("15th March", "Good Friday");
    }

    private String getAllAprilHolidays() {
        return formatHoliday("2nd April", "Ram Navami") + "\n" +
                formatHoliday("6th April", "Mahavir Jayanti") + "\n" +
                formatHoliday("14th April", "Baisakhi") + "\n" +
                formatHoliday("14th April", "Ambedkar Jayanti");
    }

    private String getAllMayHolidays() {
        return formatHoliday("1st May", "May Day");
    }

    private String getAllJuneHolidays() {
        return formatHoliday("24th June", "Eid al-Fitr");
    }

    private String getAllAugustHolidays() {
        return formatHoliday("15th August", "Independence Day (National Holiday)") + "\n" +
                formatHoliday("11th August", "Raksha Bandhan");
    }

    private String getAllSeptemberHolidays() {
        return formatHoliday("10th September", "Ganesh Chaturthi") + "\n" +
                formatHoliday("13th September", "Onam");
    }

    private String getAllOctoberHolidays() {
        return formatHoliday("2nd October", "Gandhi Jayanti (National Holiday)") + "\n" +
                formatHoliday("5th October", "Dussehra") + "\n" +
                formatHoliday("24th October", "Diwali");
    }

    private String getAllNovemberHolidays() {
        return formatHoliday("12th November", "Guru Nanak Jayanti") + "\n" +
                formatHoliday("19th November", "Eid al-Adha");
    }

    private String getAllDecemberHolidays() {
        return formatHoliday("25th December", "Christmas Day") + "\n" +
                formatHoliday("26th December", "Guru Gobind Singh Jayanti");
    }
}
