package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 90, 80, 70, 60};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(input));
    }

}