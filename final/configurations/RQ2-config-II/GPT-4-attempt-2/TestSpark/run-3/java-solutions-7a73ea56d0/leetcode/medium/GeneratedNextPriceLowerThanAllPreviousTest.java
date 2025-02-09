package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextPriceLowerThanAllPreviousTest {

    @Test
    public void nextPriceLowerThanAllPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(101));
        Assert.assertEquals(2, onlineStockSpan.next(102));
        Assert.assertEquals(3, onlineStockSpan.next(103));
        Assert.assertEquals(1, onlineStockSpan.next(90));
    }

}