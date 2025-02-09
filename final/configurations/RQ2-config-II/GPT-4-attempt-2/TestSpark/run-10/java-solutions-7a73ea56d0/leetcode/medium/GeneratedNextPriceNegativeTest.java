package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceNegativeTest {

    @Test
    public void nextPriceNegativeTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int result = obj.next(-5);
        Assert.assertEquals(0, result);
    }

}