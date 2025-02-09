package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTwoElementsDecreasingTest {

    @Test
    public void calculateSpansTwoElementsDecreasingTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        int[] prices = new int[]{105, 100};
        int[] result = onSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1}, result);
    }

}