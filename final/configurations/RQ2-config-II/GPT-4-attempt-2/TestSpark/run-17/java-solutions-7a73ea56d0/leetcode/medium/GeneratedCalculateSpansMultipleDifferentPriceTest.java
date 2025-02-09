package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleDifferentPriceTest {

    @Test
    public void calculateSpansMultipleDifferentPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 120, 90};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 3, 1}, result);
    }

}