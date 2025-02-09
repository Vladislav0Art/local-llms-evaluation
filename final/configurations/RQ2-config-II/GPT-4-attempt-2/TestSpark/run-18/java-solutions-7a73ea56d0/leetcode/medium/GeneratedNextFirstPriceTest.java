package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextFirstPriceTest {

    @Test
    public void nextFirstPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        Assert.assertEquals(1, result);
    }

}