package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedNextMultiplePricesAscendingTest {

    @Test
    public void nextMultiplePricesAscendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 200, 300, 400, 500};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < prices.length; i++) {
            int actual = stockSpan.next(prices[i]);
            Assert.assertEquals(expected[i], actual);
        }
    }

}