package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTestWithMixedPrices {

    @Test
    public void nextTestWithMixedPrices() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(80);
        span.next(60);
        int result = span.next(120);
        Assert.assertEquals(4, result);
    }

}