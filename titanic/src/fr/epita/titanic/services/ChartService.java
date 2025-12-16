package fr.epita.titanic.services;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChartService {


    public static void displayCategoryChart(Map<String, ? extends Number> map, String title) {

        // Create Chart
        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();

        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);


        // Series
        chart.addSeries(title,
                new ArrayList<>(map.keySet()),
                new ArrayList<>(map.values()));

        new SwingWrapper<CategoryChart>(chart).displayChart();
    }

    public static void displayPieChart(Map<?, ? extends Number> map, String title) {

        // Create Chart
        PieChart chart = new PieChartBuilder().width(800).height(600).title(title).build();

        // Customize Chart
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);


        // Series
        for (Object key : map.keySet()) {
            chart.addSeries(String.valueOf(key),map.get(key));
        }


        new SwingWrapper<PieChart>(chart).displayChart();
    }

    public static void displayScatterPlot(List<? extends Number> xAxis, List<? extends Number> yAxis, String title) {
        // Create Chart
        XYChart chart = new XYChartBuilder().width(800).height(600).build();

        // Customize Chart
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Scatter);
        chart.getStyler().setChartTitleVisible(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideSW);
        chart.getStyler().setMarkerSize(16);

        // Series
        chart.addSeries(title, xAxis, yAxis);

        new SwingWrapper<XYChart>(chart).displayChart();
    }

}
