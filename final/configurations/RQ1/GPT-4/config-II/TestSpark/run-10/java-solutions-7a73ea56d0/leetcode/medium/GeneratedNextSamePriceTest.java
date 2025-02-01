package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextSamePriceTest {

    @Test
    public void nextSamePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        int result = stockSpan.next(10);
        Assert.assertEquals(2, result);
    }

}