package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(60);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);
        onlineStockSpan.next(75);
        onlineStockSpan.next(85);
        int response = onlineStockSpan.next(120);
        Assert.assertEquals(8, response);
    }

}