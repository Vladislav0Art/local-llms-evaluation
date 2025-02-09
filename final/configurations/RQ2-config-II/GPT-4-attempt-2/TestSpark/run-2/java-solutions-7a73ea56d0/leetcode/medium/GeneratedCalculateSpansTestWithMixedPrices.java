package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTestWithMixedPrices {

    @Test
    public void calculateSpansTestWithMixedPrices() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 110, 90, 120, 105});
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}