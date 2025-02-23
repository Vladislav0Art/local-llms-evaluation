package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10, 11, 9};
        int[] expected = {1, 2, 1};
        assertArrayEquals(expected, obj.calculateSpans(prices));
    }

}