package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] result = obj.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}