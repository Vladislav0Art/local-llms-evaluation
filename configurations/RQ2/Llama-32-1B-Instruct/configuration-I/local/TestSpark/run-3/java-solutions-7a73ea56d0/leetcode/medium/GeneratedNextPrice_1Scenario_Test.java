package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedNextPrice_1Scenario_Test {

    @Test
    public void nextPrice_1Scenario_Test() {
        int price = 0;
        OnlineStockSpan.OnlineStockSpan result = new OnlineStockSpan();
        String actual = result.next(price);
        assertEquals(1, actual);
    }

}