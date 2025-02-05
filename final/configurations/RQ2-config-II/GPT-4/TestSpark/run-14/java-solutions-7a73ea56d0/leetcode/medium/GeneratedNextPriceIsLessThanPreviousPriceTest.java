package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceIsLessThanPreviousPriceTest {

    @Test
    public void nextPriceIsLessThanPreviousPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int actual = onlineStockSpan.next(6);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(5);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(3);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(2);
        Assert.assertEquals(1, actual);
    }

}