package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceEqualToPreviousPriceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceEqualToPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(1, onlineStockSpan.next(100));
    }

}