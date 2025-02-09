package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextLessThanPreviousPriceTest {

    @Test
    public void nextLessThanPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(80);
        Assert.assertEquals(1, result);
    }

}