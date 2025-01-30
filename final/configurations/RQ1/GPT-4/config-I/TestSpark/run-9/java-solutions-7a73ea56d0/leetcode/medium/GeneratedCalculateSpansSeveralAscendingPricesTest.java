package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSeveralAscendingPricesTest {

    @Test
    public void calculateSpansSeveralAscendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10, 20, 30});
        Assert.assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}