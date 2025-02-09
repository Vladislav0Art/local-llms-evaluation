package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextLowerValueTest {

    @Test
    public void nextLowerValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(7);
        Assert.assertEquals(1, stockSpan.next(6));
    }

}