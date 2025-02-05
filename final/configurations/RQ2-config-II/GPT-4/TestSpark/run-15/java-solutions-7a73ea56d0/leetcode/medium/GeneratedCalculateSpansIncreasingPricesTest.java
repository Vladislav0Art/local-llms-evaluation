package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100, 200, 300}));
    }

}