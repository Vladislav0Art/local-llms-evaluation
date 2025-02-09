package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleDecreasingPricesTest {

    @Test
    public void calculateSpansMultipleDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{130, 120, 110, 100});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

}