package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansSingletonArrayTest {

    @Test
    public void calculateSpansSingletonArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}