package ru.netology.stats;

public class StatsService {

    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAvg(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAvg(int[] sales) {
        int counter = 0;
        int AvgSales = calculateSumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale < AvgSales) {
                counter++;
            }
        }
        return counter;

    }

    public int aboveAvg(int[] sales) {
        int counter = 0;
        int AvgSales = calculateSumSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale > AvgSales) {
                counter++;
            }
        }
        return counter;

    }
}

