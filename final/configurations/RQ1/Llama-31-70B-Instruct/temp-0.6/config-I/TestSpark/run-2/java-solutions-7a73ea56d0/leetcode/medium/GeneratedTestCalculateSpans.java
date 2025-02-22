package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTestCalculateSpans {

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 4, 5, 90, 120, 80};
        int[] expectedSpans = new int[]{1, 1, 2, 4, 5, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}