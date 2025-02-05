package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 2, 3, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{100, 200, 300, 50}));
    }

}