package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 120};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 4}, result);
    }

}