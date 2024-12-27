package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyPricesTest {

    @Test
    public void calculateSpansEmptyPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}