package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceIsGreaterThanPreviousPriceTest {

    @Test
    public void nextPriceIsGreaterThanPreviousPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int actual = onlineStockSpan.next(3);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(5);
        Assert.assertEquals(2, actual);

        actual = onlineStockSpan.next(1);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(4);
        Assert.assertEquals(2, actual);
    }

}