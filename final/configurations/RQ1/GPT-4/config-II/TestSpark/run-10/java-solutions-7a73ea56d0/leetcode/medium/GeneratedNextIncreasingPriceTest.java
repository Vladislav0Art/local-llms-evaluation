package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextIncreasingPriceTest {

    @Test
    public void nextIncreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        int result = stockSpan.next(20);
        Assert.assertEquals(2, result);
    }

}