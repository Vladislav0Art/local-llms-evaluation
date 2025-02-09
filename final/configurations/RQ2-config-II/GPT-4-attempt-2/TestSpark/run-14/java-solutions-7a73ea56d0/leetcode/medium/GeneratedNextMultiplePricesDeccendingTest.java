package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedNextMultiplePricesDeccendingTest {

    @Test
    public void nextMultiplePricesDeccendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{500, 400, 300, 200, 100};
        int[] expected = new int[]{1, 1, 1, 1, 1};

        for (int i = 0; i < prices.length; i++) {
            int actual = stockSpan.next(prices[i]);
            Assert.assertEquals(expected[i], actual);
        }
    }

}