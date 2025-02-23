package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansInvalidPricesTest {

    @Test
    public void calculateSpansInvalidPricesTest() {
        int[] prices = {0, -1, 1, 2};

        int[] expected = {1, 1, 1, 1};
        int[] result = OnlineStockSpan.calculateSpans(prices);

        assertArrayEquals(expected, result);
    }

}