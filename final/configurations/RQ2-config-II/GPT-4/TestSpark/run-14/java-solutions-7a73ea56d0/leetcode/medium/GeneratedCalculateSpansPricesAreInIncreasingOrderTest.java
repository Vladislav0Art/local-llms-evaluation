package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansPricesAreInIncreasingOrderTest {

    @Test
    public void calculateSpansPricesAreInIncreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] prices = {1, 2, 3, 4, 5};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, actual);
    }

}