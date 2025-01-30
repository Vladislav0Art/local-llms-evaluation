package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementTest {

    @Test
    public void calculateSpansMultipleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 103, 99, 98, 105};
        int[] spans = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 1, 1, 5}, spans);
    }

}