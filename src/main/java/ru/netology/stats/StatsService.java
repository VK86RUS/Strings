package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long generalSale = 0;
        for (long sale : sales) {
            generalSale += sale;
        }
        return generalSale;
    }

    public long averageAmount(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int belowTheAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveTheAverage(long[] sales) {
        int counter = 0;
        long averageSale = averageAmount(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}