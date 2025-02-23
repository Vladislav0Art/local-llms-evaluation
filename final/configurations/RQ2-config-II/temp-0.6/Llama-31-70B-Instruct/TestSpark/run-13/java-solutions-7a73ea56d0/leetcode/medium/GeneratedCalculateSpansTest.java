package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] expectedSpans = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}