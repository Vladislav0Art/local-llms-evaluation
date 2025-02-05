package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] expected = new int[]{1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(new int[]{300, 200, 100}));
    }

}