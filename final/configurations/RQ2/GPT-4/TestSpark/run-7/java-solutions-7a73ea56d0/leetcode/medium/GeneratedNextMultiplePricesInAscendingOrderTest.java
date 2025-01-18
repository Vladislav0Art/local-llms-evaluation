package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesInAscendingOrderTest {

    @Test
    public void nextMultiplePricesInAscendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(30);
        Assert.assertEquals(3, result);
    }

}