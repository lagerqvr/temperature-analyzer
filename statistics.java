package com.company;

import java.util.Arrays;

public class Statistics {

    static double Max(int[] values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
    static double Min(int[] values) {
        int smallest = Arrays.stream(values).min().getAsInt();
        return smallest;

    }
    static double Average(int[] values) {
        double ave = Arrays.stream(values).average().orElse(Double.NaN);
        return (int) ave;
    }
    static double Median(int[] values) {
        Arrays.sort(values);
        if (values.length % 2 == 0) {
            int median = (values[(values.length / 2)] + values[(values.length -1) / 2]) / 2;
            return median;
        }
        else {
            int median = (values[values.length / 2]);
            return median;
        }
    }
    static double Stdev(int[] values) {
        double ave = Arrays.stream(values).average().orElse(Double.NaN);
        double stdev =Math.sqrt(ave);
        return (int) stdev;
    }
}
