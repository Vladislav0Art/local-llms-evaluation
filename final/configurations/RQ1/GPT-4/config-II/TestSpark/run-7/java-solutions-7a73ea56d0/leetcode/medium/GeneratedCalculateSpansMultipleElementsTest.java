package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{90, 95, 92, 100};
        int[] expected = new int[]{1, 2, 1, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals("Span array different from expected", expected, result);
    }

}