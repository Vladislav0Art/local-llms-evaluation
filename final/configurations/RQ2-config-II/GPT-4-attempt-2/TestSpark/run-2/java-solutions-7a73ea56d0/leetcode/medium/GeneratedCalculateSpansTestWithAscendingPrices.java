package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTestWithAscendingPrices {

    @Test
    public void calculateSpansTestWithAscendingPrices() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 105, 110, 120});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}