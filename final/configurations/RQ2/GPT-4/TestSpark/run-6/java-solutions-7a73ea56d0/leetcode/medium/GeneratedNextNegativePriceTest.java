package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextNegativePriceTest {

    @Test
    public void nextNegativePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(-1);
        Assert.assertEquals(1, result);
    }

}