package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = {100};
        int[] spans = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, spans);
    }

}