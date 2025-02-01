package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithDecreasingPricesTest {

    @Test
    public void calculateSpansWithDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {300, 200, 100, 50, 10};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}