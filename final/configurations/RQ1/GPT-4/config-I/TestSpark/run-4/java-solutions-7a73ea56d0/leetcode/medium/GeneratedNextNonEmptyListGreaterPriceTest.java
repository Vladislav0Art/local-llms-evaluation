package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextNonEmptyListGreaterPriceTest {

    @Test
    public void nextNonEmptyListGreaterPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(120);
        Assert.assertEquals(2, result);
    }

}