package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, stock.calculateSpans(prices));
    }

}