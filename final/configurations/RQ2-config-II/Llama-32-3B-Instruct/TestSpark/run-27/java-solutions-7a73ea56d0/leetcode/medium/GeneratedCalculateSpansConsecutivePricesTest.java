package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansConsecutivePricesTest {

    @Test
    public void calculateSpansConsecutivePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 110, 120};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 4}, result);
    }

}