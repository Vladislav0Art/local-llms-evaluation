package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_PricesAreNegativeAndThenPositive_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_PricesAreNegativeAndThenPositive_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {-100, -80, -75, 50};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}