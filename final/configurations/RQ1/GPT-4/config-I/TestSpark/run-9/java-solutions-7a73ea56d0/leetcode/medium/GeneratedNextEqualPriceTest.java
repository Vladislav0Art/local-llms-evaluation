package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextEqualPriceTest {

    @Test
    public void nextEqualPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(100);
        Assert.assertEquals(2, result);
    }

}