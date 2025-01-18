package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesInDescendingOrderTest {

    @Test
    public void nextMultiplePricesInDescendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(30);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(10);
        Assert.assertEquals(1, result);
    }

}