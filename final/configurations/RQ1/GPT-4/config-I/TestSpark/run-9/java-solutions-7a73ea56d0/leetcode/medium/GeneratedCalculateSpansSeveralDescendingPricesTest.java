package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSeveralDescendingPricesTest {

    @Test
    public void calculateSpansSeveralDescendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{30, 20, 10});
        Assert.assertArrayEquals(new int[]{1, 1, 1}, result);
    }

}