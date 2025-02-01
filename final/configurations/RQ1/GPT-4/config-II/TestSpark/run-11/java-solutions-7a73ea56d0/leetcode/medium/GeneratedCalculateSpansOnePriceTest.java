package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansOnePriceTest {

    @Test
    public void calculateSpansOnePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{85};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}