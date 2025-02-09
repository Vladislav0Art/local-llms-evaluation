package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 105, 110, 115, 120};
        int[] comparison = {1, 2, 3, 4, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

}