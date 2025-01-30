package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansWithMixedValuesTest {

    @Test
    public void calculateSpansWithMixedValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 20, 2, 25};
        int[] expected = {1, 1, 3, 1, 5};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}