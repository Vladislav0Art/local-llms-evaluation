package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTwoPricesTest {

    @Test
    public void calculateSpansTwoPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100, 120});
        Assert.assertArrayEquals(new int[]{1, 2}, spans);
    }

}