package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleIncreasingPricesTest {

    @Test
    public void calculateSpansMultipleIncreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{100, 110, 120, 130});
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}