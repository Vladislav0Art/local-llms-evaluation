package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesMixedTest {

    @Test
    public void calculateSpansMultiplePricesMixedTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 110, 100, 120, 110});
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}