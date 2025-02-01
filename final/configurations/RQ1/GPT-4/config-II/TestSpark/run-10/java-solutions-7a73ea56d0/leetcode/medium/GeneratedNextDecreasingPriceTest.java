package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNextDecreasingPriceTest {

    @Test
    public void nextDecreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(20);
        int result = stockSpan.next(10);
        Assert.assertEquals(1, result);
    }

}