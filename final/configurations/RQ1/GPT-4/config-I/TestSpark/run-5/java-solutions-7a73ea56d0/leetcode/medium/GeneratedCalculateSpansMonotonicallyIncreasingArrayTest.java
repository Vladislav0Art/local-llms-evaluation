package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansMonotonicallyIncreasingArrayTest {

    @Test
    public void calculateSpansMonotonicallyIncreasingArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{50, 100, 200};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}