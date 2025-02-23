package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest_NonZeroSpans {

    @Test
    public void calculateSpansTest_NonZeroSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] spans = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}