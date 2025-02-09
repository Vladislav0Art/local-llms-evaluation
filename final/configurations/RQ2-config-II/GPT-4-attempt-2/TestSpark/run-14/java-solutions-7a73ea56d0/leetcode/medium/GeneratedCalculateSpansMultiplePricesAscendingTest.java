package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedCalculateSpansMultiplePricesAscendingTest {

    @Test
    public void calculateSpansMultiplePricesAscendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 200, 300, 400, 500};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] actual = stockSpan.calculateSpans(prices);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

}