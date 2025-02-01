package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyListTest {

    @Test
    public void calculateSpansEmptyListTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals("Span array for empty prices should be empty", 0, result.length);
    }

}