package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTwoElementsIncreasingTest {

    @Test
    public void calculateSpansTwoElementsIncreasingTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 105};
        int[] result = onSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2}, result);
    }

}