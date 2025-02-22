package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100, 100, 100};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}