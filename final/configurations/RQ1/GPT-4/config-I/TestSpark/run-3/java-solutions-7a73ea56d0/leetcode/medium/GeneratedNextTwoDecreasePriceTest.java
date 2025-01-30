package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTwoDecreasePriceTest {

    @Test
    public void nextTwoDecreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(150);
        int actual = stockSpan.next(100);
        Assert.assertEquals(1, actual);
    }

}