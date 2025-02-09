package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceLessThanPreviousPriceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceLessThanPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(1, onlineStockSpan.next(80));
    }

}