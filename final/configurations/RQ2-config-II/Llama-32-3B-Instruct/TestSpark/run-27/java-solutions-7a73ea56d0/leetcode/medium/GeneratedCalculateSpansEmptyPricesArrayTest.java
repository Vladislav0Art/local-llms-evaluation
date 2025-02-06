package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansEmptyPricesArrayTest {

    @Test
    public void calculateSpansEmptyPricesArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{}, result);
    }

}