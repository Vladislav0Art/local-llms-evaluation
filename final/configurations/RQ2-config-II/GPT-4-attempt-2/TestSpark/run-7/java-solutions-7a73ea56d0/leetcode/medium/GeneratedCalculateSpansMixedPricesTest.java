package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMixedPricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansMixedPricesTest() {
        int[] prices = {100, 200, 300, 250, 260, 150, 350};
        int[] expected = {1, 2, 3, 1, 2, 1, 3};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}