package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextPriceInBetweenPreviousTest {

    @Test
    public void nextPriceInBetweenPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(101));
        Assert.assertEquals(2, onlineStockSpan.next(102));
        Assert.assertEquals(3, onlineStockSpan.next(103));
        Assert.assertEquals(4, onlineStockSpan.next(104));
        Assert.assertEquals(2, onlineStockSpan.next(103));
    }

}