package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansWithEqualValuesTest {

    @Test
    public void calculateSpansWithEqualValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}