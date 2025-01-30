package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansAscendingElementsTest {

    @Test
    public void calculateSpansAscendingElementsTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {60, 80, 100, 120};
        int[] result = onlineStockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}