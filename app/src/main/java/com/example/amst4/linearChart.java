package com.example.amst4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class linearChart extends AppCompatActivity {
    LinechartView lineChartView;

    String[] axisdata = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept",
            "Oct", "Now", "Dec"};

    int[] yAxisData = {50, 20, 15, 30, 20, 60, 15, 40, 45, 10, 90, 18};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_chart);

        UinechartView = findViewById(R.id.chart);

        List yAxisValues = new ArrayList();

        List axisValues = new ArrayList();

        Line line = new Line(yAxisValues) .setColor(Color.parsecolor( colorString: "R9C2780"));
        for (int i =0; i < axisData.Length; i++) {

        X axisValues.add(i, new AxisValue(i).setLabel(axisdata[i]));

        for (int i = 0; i < yAxisData.lengt
        yAxisValues .add (new PointValue(i,
                J

                List lines = new ArrayList();

        lines.add (line);





        LineChartData data
        data.setLines (lines);

        new LinechartOata();



        Axis axis = new Axis()
        axis.setvalues (axisvalues);
        axis.setTextSize(16);

        axis.setTextColor (Color.parseColor( colorString: "s03A9F4"));
        data.setAxisiBottom(axis)







        Axis yAxis = new Axis();

        yAxis.setName("Sales in millions");
        YAxis.setTextColor(Color .parseColorl colotrins: "S03A9F4"));
        yAxis.setTextSize(16);

        data.setAxisYLeft(yAxis);
    }
}