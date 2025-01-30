package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextHigherPriceTest {

    @Test
    public void nextHigherPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(200);
        Assert.assertEquals(2, result);
    }

}