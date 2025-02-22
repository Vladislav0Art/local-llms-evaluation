package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestCalculateSpans {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testCalculateSpans() {
        int[] prices = {10, 20, 20, 40};
        int[] expectedSpans = {1, 2, 1, 4};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}