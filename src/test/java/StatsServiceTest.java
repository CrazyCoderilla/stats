import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StatsServiceTest {
    StatsService ss;
    long[] sales;

    @BeforeAll
    public void init() {
        ss = new StatsService();
        sales = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }

    @Test
    public void getTotalRevenue() {
        assertEquals(180, ss.getTotalRevenue(sales));
    }

    @Test
    public void getAverageSale() {
        assertEquals(15, ss.getAverageSale(sales));
    }

    @Test
    public void getTopMonth() {
        assertEquals(8, ss.getTopMonth(sales));
    }

    @Test
    public void getWorstMonth() {
        assertEquals(9, ss.getWorstMonth(sales));
    }

    @Test
    public void getMonthsAmountWorseAverage() {
        assertEquals(5, ss.getMonthsAmountWorseAverage(sales));
    }

    @Test
    public void getMonthsAmountBetterAverage() {
        assertEquals(5, ss.getMonthsAmountBetterAverage(sales));
    }
}