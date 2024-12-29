package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMixedPricesTest {

    @Test
    public void calculateSpansMixedPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 60, 70, 60, 75, 85};
        int[] spans = span.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, spans);
    }

}