package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedCalculateSpansMultiplePricesDescendingTest {

    @Test
    public void calculateSpansMultiplePricesDescendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{500, 400, 300, 200, 100};
        int[] expected = new int[]{1, 1, 1, 1, 1};

        int[] actual = stockSpan.calculateSpans(prices);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

}