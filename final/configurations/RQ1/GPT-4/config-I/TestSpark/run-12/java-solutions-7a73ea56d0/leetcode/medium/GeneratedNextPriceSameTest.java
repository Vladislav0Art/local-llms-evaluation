package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceSameTest {

    @Test
    public void nextPriceSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(100));
        Assert.assertEquals(2, stockSpan.next(100));
        Assert.assertEquals(3, stockSpan.next(100));
    }

}