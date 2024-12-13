package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNext_IncreasingPriceTest {

    @Test
    public void next_IncreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int expected = 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

}