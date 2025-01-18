package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesInUnorderedTest {

    @Test
    public void nextMultiplePricesInUnorderedTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(40);
        Assert.assertEquals(4, result);
    }

}