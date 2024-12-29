package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesSameTest {

    @Test
    public void calculateSpansAllPricesSameTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        int[] spans = span.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, spans);
    }

}