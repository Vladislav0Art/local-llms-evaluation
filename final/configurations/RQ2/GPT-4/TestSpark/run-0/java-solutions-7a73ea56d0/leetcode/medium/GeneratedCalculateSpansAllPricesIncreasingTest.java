package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesIncreasingTest {

    @Test
    public void calculateSpansAllPricesIncreasingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {50, 60, 70, 80, 90};
        int[] spans = span.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

}