package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceGreaterThanPreviousTest {

    @Test
    public void nextPriceGreaterThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(80);
        int result = stockSpan.next(100);
        Assert.assertEquals(2, result);
    }

}