package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextSameValueTest {

    @Test
    public void nextSameValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        Assert.assertEquals(2, stockSpan.next(10));
    }

}