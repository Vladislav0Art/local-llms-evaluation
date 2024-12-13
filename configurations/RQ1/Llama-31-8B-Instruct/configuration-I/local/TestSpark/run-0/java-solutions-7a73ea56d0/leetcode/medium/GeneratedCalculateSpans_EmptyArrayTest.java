package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_EmptyArrayTest {

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}