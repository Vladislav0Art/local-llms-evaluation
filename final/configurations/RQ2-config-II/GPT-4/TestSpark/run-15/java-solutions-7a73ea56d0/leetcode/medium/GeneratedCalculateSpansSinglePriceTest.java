package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100}));
    }

}