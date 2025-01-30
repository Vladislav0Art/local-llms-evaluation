package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTwoIncreasePriceTest {

    @Test
    public void nextTwoIncreasePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int actual = stockSpan.next(150);
        Assert.assertEquals(2, actual);
    }

}