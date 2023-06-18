package ru.netology.javaqa.array_1.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StatsServiceTest {

    @Test
    void sumSales() { // сумма за все месяцы
        StatsService service = new StatsService();

        int expected = 180; //ожидаемый результат
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод
        int actual = service.sumSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void avergSales() { //средние продажи
        StatsService service = new StatsService();

        double expected = 15; //ожидаемый результат
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод:
        double actual = service.avergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void maxSales() { //максимальные продажи
        StatsService service = new StatsService();

        int expected = 8; //ожидаемый результат
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void minSales() { //минимальные продажи
        StatsService service = new StatsService();

        int expected = 9; //ожидаемый результат
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void lessAvergSales() {
        StatsService service = new StatsService();

        int expected = 7; //ожидаемый результат
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.lessAvergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void aboveAvergSales() {
        StatsService service = new StatsService();

        int expected = 7;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int actual = service.aboveAvergSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
