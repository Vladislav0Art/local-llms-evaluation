package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAllPricesSameTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansAllPricesSameTest() {
        int[] prices = {100, 100, 100, 100, 100};
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}