package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesInDescendingOrderTest {

    @Test
    public void calculateSpansMultiplePricesInDescendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{30, 20, 10});
        Assert.assertArrayEquals(new int[]{1, 1, 1}, result);
    }

}