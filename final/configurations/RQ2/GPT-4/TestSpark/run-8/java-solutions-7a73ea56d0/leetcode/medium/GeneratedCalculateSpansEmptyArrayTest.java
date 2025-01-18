package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = {};
        int[] spans = spanner.calculateSpans(prices);
        assertTrue(spans.length == 0);
    }

}