package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan onSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] result = onSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, result);
    }

}