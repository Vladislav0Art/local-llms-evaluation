package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, stockSpan.next(2));
        Assert.assertEquals(2, stockSpan.next(3));
        Assert.assertEquals(3, stockSpan.next(4));
    }

}