package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextNewPriceTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int response = onlineStockSpan.next(100);
        Assert.assertEquals(1, response);
    }

}