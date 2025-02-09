package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceMoreThanPreviousPriceTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceMoreThanPreviousPriceTest() {
        onlineStockSpan.next(100);
        Assert.assertEquals(2, onlineStockSpan.next(120));
    }

}