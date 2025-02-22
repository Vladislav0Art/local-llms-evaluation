package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllSamePricesTest {

    @Test
    public void calculateSpansAllSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10};
        int[] expected = {1, 2, 3};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}