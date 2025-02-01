package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100, 120, 90, 150, 180, 170, 200});
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 5, 1, 7}, spans);
    }

}