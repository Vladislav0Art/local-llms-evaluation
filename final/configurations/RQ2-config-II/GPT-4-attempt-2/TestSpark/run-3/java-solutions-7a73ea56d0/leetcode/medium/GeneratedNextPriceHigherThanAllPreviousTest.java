package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextPriceHigherThanAllPreviousTest {

    @Test
    public void nextPriceHigherThanAllPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(100));
        Assert.assertEquals(1, onlineStockSpan.next(90));
        Assert.assertEquals(1, onlineStockSpan.next(80));
        Assert.assertEquals(4, onlineStockSpan.next(101));
    }

}