package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTestWithLowerPrice {

    @Test
    public void nextTestWithLowerPrice() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(80);
        Assert.assertEquals(1, result);
    }

}