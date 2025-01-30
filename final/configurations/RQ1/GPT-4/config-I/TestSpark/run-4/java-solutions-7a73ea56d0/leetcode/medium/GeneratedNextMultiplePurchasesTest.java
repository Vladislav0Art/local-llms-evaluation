package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextMultiplePurchasesTest {

    @Test
    public void nextMultiplePurchasesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(60);
        int result = onlineStockSpan.next(120);
        Assert.assertEquals(4, result);
    }

}