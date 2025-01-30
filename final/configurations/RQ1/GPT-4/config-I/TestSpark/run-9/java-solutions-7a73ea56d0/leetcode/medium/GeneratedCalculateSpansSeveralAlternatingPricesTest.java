package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedCalculateSpansSeveralAlternatingPricesTest {

    @Test
    public void calculateSpansSeveralAlternatingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10, 30, 20, 40});
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4}, result);
    }

}