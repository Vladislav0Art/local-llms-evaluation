package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesIncreasingTest {

    @Test
    public void calculateSpansMultiplePricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 110, 120});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}