package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesDecreasingTest {

    @Test
    public void calculateSpansAllPricesDecreasingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 90, 80, 70, 60, 50};
        int[] spans = span.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1}, spans);
    }

}