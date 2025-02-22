package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}