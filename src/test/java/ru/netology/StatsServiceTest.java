package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    //1
    public void totalAmountAllTime() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        int actualMonth = service.totalAmountSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //2
    public void averageNumberOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 15;
        int actualMonth = service.averageNumberOfSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //4
    public void shouldMinFindTheLast() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //3
    public void shouldMaxFindTheLast() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //5
    public void belowAverageSaleses() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.salesLessAver(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    //6
    //public void aboveAverageSales()
    public void average()
    {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.aboveAverageSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
