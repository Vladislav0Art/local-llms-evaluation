package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesDecreasingTest {

    @Test
    public void calculateSpansMultiplePricesDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{120, 110, 100});
        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

}