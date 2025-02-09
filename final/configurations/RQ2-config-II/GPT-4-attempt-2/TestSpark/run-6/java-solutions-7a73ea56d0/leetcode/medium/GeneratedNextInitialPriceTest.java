package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextInitialPriceTest {

    @Test
    public void nextInitialPriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        Assert.assertEquals(1, result);
    }

}