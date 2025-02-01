package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}