package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansMonotonicallyDecreasingArrayTest {

    @Test
    public void calculateSpansMonotonicallyDecreasingArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{200, 100, 50};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

}