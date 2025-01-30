package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(95);
        stockSpan.next(120);
        stockSpan.next(110);
        int actual = stockSpan.next(121);
        Assert.assertEquals(3, actual);
    }

}