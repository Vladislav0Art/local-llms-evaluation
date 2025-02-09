package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedNextSinglePriceTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 100;
        int expected = 1;

        int actual = stockSpan.next(price);

        Assert.assertEquals(expected, actual);
    }

}