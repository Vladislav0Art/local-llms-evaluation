package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}