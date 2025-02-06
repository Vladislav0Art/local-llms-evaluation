package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 200, 50};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3}, result);
    }

}