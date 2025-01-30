package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextLowerPriceTest {

    @Test
    public void nextLowerPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(80);
        Assert.assertEquals(1, result);
    }

}