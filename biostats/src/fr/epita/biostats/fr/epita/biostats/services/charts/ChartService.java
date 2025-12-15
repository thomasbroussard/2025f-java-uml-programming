package fr.epita.biostats.fr.epita.biostats.services.charts;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

import java.util.*;

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
}
