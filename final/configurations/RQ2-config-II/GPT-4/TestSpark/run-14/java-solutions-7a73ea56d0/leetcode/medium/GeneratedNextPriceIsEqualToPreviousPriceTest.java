package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNextPriceIsEqualToPreviousPriceTest {

    @Test
    public void nextPriceIsEqualToPreviousPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int actual = onlineStockSpan.next(7);
        Assert.assertEquals(1, actual);

        actual = onlineStockSpan.next(7);
        Assert.assertEquals(2, actual);

        actual = onlineStockSpan.next(7);
        Assert.assertEquals(3, actual);
    }

}