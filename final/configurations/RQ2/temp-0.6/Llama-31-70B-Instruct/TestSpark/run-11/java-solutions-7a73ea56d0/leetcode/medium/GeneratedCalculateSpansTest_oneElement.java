package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest_oneElement {

    @Test
    public void calculateSpansTest_oneElement() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1};
        int[] actual = stock.calculateSpans(prices);
        assertEquals(1, actual.length);
        assertEquals(1, actual[0]);
    }

}