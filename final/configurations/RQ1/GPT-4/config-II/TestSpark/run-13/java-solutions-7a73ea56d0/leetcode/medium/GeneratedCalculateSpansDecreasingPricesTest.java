package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{200, 190, 180, 170, 160});
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1}, spans);
    }

}