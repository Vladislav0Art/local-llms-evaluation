package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedCalculateSpansMultipleSamePriceTest {

    @Test
    public void calculateSpansMultipleSamePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 100, 100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}