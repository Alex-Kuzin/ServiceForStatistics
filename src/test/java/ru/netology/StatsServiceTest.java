package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void totalAmountAllTime() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        int actualMonth = service.totalAmountSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void averageNumberOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 15;
        int actualMonth = service.averageNumberOfSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldMinFindTheLast() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldMaxFindTheLast() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void belowAverageSaleses() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.salesLessAver(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void average()
    {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
