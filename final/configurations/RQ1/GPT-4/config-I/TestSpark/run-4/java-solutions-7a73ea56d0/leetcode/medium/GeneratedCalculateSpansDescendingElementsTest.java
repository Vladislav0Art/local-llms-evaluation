package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansDescendingElementsTest {

    @Test
    public void calculateSpansDescendingElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {120, 100, 80, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

}