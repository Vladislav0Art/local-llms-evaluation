package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, stockSpan.calculateSpans(input));
    }

}