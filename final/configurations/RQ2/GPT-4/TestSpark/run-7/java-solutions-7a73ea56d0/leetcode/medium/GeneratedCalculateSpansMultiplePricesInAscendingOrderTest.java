package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansMultiplePricesInAscendingOrderTest {

    @Test
    public void calculateSpansMultiplePricesInAscendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30});
        Assert.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}