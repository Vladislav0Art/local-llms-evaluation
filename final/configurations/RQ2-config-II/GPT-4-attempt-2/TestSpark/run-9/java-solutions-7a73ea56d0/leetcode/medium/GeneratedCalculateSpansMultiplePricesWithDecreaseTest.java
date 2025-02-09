package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesWithDecreaseTest {

    @Test
    public void calculateSpansMultiplePricesWithDecreaseTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100, 80, 120, 50, 70});
        assertArrayEquals(new int[]{1, 1, 3, 1, 2}, spans);
    }

}