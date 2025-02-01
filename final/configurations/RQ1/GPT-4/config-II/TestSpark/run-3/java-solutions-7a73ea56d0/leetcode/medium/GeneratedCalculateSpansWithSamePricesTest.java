package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithSamePricesTest {

    @Test
    public void calculateSpansWithSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}