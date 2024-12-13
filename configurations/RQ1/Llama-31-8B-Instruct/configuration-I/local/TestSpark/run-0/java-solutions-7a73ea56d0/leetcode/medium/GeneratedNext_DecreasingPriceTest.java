package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_DecreasingPriceTest {

    @Test
    public void next_DecreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int expected = i + 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

}