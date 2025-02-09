package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 90, 120, 70, 75, 85, 95};
        int[] comparison = {1, 1, 2, 4, 1, 2, 3, 4};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

}