package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextNegativeTest {

    @Test
    public void nextNegativeTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        Assert.assertEquals(2, stockSpan.next(3));
        Assert.assertEquals(1, stockSpan.next(2));
        Assert.assertEquals(1, stockSpan.next(1));
    }

}