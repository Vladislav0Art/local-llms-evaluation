package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextHigherPriceTest {

    @Test
    public void nextHigherPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(120);
        Assert.assertEquals(2, result);
    }

}