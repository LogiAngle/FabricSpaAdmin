package com.fabricadmin.logiangle.fabricspaadmin.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fabricadmin.logiangle.fabricspaadmin.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;

import java.util.ArrayList;

public class AnalyticsFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.analytics_pie_chart, null);
        PieChart pieChart = (PieChart) view.findViewById(R.id.pieChart);
        //pieChart.setOnChartValueSelectedListener(this);
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(14, 0));
        entries.add(new Entry(10, 1));
        entries.add(new Entry(16, 2));
        entries.add(new Entry(12, 3));
        entries.add(new Entry(4, 4));
        entries.add(new Entry(8, 5));
        entries.add(new Entry(6, 6));
        //        entries.add(new Entry(7f, 7));
//                entries.add(new Entry(9f, 5));

        PieDataSet dataset = new PieDataSet(entries, "");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Assigned");
        labels.add("In-transit");
        labels.add("Breached");
        labels.add("Re-scheduled");
        labels.add("Complete");
        labels.add("Canceled");
        labels.add("New");
        PieData data = new PieData(labels, dataset); // initialize Piedata
        pieChart.setData(data);


        dataset.setSliceSpace(1);

        Legend legend = pieChart.getLegend();
        legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART_CENTER);
        legend.setTextSize(12f);


        final int[] MY_COLORS = {
                Color.rgb(205, 133, 63),
                Color.rgb(255, 255, 0),
                Color.rgb(0, 200, 0),
                Color.rgb(255, 145, 0),
                Color.rgb(132, 112, 255),
                Color.rgb(169, 169, 169),
                Color.rgb(255, 0, 0)};
        ArrayList<Integer> colors = new ArrayList<Integer>();

        for (int c : MY_COLORS)
            colors.add(c);
        dataset.setColors(colors);
        pieChart.setDescription("");
        pieChart.setCenterText("Total no of \n orders \n 1000");
        pieChart.setCenterTextSize(15f);
        pieChart.animateY(3000);

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
