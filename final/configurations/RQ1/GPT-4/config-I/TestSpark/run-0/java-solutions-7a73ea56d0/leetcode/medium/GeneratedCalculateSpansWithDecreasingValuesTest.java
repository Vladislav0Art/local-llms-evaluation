package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansWithDecreasingValuesTest {

    @Test
    public void calculateSpansWithDecreasingValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}