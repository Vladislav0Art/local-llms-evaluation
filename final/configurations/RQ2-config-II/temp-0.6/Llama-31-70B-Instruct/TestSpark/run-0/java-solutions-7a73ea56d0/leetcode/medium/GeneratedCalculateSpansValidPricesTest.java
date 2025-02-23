package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansValidPricesTest {

    @Test
    public void calculateSpansValidPricesTest() {
        int[] prices = {10, 20, 30, 40};

        int[] expected = {1, 1, 1, 1};
        int[] result = OnlineStockSpan.calculateSpans(prices);

        assertArrayEquals(expected, result);
    }

}