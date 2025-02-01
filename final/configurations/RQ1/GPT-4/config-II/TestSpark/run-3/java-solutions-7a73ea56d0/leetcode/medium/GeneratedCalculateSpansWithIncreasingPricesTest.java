package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithIncreasingPricesTest {

    @Test
    public void calculateSpansWithIncreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 100, 150, 200, 250, 300};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}