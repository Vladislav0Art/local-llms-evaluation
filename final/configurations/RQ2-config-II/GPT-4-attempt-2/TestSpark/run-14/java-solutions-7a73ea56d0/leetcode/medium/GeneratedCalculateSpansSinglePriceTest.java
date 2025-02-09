package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] expected = new int[]{1};

        int[] actual = stockSpan.calculateSpans(prices);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

}