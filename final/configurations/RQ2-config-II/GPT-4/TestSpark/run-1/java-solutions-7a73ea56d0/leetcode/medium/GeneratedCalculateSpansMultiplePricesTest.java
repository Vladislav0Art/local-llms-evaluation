package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultiplePricesTest {

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan spanCalculator = new OnlineStockSpan();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = spanCalculator.calculateSpans(prices);

        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, spans);
    }

}