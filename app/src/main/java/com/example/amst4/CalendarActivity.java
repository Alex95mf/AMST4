package com.example.amst4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";
    Private CalendarView mCalendarView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener((CalendarView, year, month, dayOfNonth) → {
            String date = year + "/" + month + "/" + dayOfMonth;
            Log.d(TAG, msg "onSelectedDayChange: yyyy/mm/dd:" + date);
            Intent intent = new Intent(packageContext: CalendarActivity.this,MainActivity.class);
            intent.putExtra(name: "date",date);
            startActivity(intent);
        });

    }
}