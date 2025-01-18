package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesInUnorderedTest {

    @Test
    public void calculateSpansMultiplePricesInUnorderedTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{20, 30, 10, 40});
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4}, result);
    }

}