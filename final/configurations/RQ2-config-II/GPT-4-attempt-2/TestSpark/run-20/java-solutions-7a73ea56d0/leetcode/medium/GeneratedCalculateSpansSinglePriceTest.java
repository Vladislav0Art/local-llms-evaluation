package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] comparison = {1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

}