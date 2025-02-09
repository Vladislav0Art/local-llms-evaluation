package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllPricesInAscendingOrderTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansAllPricesInAscendingOrderTest() {
        int[] prices = {100, 200, 300, 400, 500};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}