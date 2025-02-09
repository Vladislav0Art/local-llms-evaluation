package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextSiblingPriceTest {

    @Test
    public void nextSiblingPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(100);
        Assert.assertEquals(2, result);
    }

}