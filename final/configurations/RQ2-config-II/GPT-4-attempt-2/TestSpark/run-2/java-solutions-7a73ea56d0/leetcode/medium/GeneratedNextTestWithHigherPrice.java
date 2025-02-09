package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTestWithHigherPrice {

    @Test
    public void nextTestWithHigherPrice() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(120);
        Assert.assertEquals(2, result);
    }

}