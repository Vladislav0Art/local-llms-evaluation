package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextGreaterPriceTest {

    @Test
    public void nextGreaterPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        Assert.assertEquals(2, onlineStockSpan.next(150));
    }

}