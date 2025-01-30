package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextOnePriceTest {

    @Test
    public void nextOnePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int actual = stockSpan.next(100);
        Assert.assertEquals(1, actual);
    }

}