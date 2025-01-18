package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextZeroPriceTest {

    @Test
    public void nextZeroPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(0);
        Assert.assertEquals(1, result);
    }

}