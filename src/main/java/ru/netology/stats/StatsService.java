package ru.netology.stats;

public class StatsService {

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int totalAmountSales(int[] sales) {
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) sumMonth += sales[i];
        return sumMonth;
    }

    public int averageNumberOfSales(int[] sales) {
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) sumMonth += sales[i];
        int arevSumMonth = sumMonth / sales.length;
        return arevSumMonth;
    }

    public int salesLessAver(int[] sales) {
        StatsService service = new StatsService();
        int actualMonth = service.averageNumberOfSales(sales);
        int minSalesGeneral = 0;
        for (int i = 0; sales.length > i; i++) {
            if (sales[i] < actualMonth) {
                minSalesGeneral++;
            }

        }
        return minSalesGeneral;
    }

    public int aboveAverageSales(int[] sales) {
        StatsService service = new StatsService();
        int actualMonth = service.averageNumberOfSales(sales);
        int maxSalesGeneral = 0;
        for (int i = 0; sales.length > i; i++) {
            if (sales[i] > actualMonth) {
                maxSalesGeneral++;
            }

        }
        return maxSalesGeneral;
    }
}