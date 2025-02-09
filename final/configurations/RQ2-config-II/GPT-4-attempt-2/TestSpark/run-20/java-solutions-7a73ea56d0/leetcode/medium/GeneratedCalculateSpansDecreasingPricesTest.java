package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 95, 90, 85, 80};
        int[] comparison = {1, 1, 1, 1, 1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(comparison, result);
    }

}