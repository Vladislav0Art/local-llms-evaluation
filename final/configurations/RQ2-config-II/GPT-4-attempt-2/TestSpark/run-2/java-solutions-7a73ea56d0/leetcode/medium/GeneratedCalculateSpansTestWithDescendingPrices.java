package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTestWithDescendingPrices {

    @Test
    public void calculateSpansTestWithDescendingPrices() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{120, 110, 100, 90});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

}