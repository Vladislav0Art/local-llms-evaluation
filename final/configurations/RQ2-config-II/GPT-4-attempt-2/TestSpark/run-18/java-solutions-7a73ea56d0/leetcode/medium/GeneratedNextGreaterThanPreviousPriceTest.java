package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextGreaterThanPreviousPriceTest {

    @Test
    public void nextGreaterThanPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(120);
        Assert.assertEquals(2, result);
    }

}