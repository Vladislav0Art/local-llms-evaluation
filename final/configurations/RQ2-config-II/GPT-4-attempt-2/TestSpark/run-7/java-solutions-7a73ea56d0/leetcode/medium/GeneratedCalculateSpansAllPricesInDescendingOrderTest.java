package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllPricesInDescendingOrderTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansAllPricesInDescendingOrderTest() {
        int[] prices = {500, 400, 300, 200, 100};
        int[] expected = {1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}