package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Assert.assertEquals(1, onlineStockSpan.next(100));
        Assert.assertEquals(1, onlineStockSpan.next(80));
        Assert.assertEquals(1, onlineStockSpan.next(60));
        Assert.assertEquals(1, onlineStockSpan.next(70));
        Assert.assertEquals(2, onlineStockSpan.next(60));
    }

}