package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextLowerValueTest {

    @Test
    public void nextLowerValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(200);
        int result = stockSpan.next(100);
        Assert.assertEquals(1, result);
    }

}